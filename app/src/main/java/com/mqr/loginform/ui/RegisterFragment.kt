package com.mqr.loginform.ui

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.mqr.loginform.R
import kotlinx.android.synthetic.main.fragment_register.*
import java.util.*


class RegisterFragment : Fragment(){

    companion object{
        fun newInstance(): RegisterFragment {
            return RegisterFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // click btn registrasi
        btn_register.setOnClickListener{
            performRegister()
        }
        //click btn select photo
        btn_select_photo_registrasi.setOnClickListener{
            Log.d("Registrasi", "Try to show photo selector")

            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, 0)
        }
    }
    var selectPhotoUri: Uri? = null
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 0 && resultCode == Activity.RESULT_OK && data != null){
            Log.d("Registrasi", "Photo was selected")

            selectPhotoUri = data?.data
            var bitmap = MediaStore.Images.Media.getBitmap(context?.getContentResolver(), selectPhotoUri)

            val bitmapDrawable = BitmapDrawable(bitmap)
            btn_select_photo_registrasi.setBackgroundDrawable(bitmapDrawable)
        }

    }

    private fun performRegister() {
        val email = et_email_register.text.toString()
        val password = et_password_register.text.toString()

        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(context, "Please enter Text in Email and Password", Toast.LENGTH_SHORT).show()
            return
        }

        Log.d("Register", "Email " + email )
        Log.d("Register", "Password " + password )



        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (!it.isSuccessful) return@addOnCompleteListener

                // else if successfull
                Log.d("Main", "Successfully created user with uid: ${it.result?.user?.uid}")
//                val fragment = LoginFragment()
//                val FragmentManager = getFragmentManager()
//                FragmentManager?.beginTransaction()
//                    ?.replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
//                    ?.commit()

                uploadImageToFirebaseStorage()



            }
            .addOnFailureListener{
                Log.d("Main","Failed to create user: ${it.message}")
                Toast.makeText(context, "Failed to create user: ${it.message}", Toast.LENGTH_SHORT).show()
            }
    }

    private fun uploadImageToFirebaseStorage(){
        if(selectPhotoUri == null) return

        val filename = UUID.randomUUID().toString()
        val ref = FirebaseStorage.getInstance().getReference(("/images/$filename"))

        ref.putFile(selectPhotoUri!!)
            .addOnSuccessListener {
                Log.d("Registrasi", "Success Upload image: ${it.metadata?.path}")

                ref.downloadUrl.addOnSuccessListener {
                    Log.d("Registrasi", "File Location: $it")

                    saveUserToFirebaseDatabase(it.toString())
                }
            }
            .addOnFailureListener{

            }

    }

    private fun saveUserToFirebaseDatabase(profileImageUrl: String) {
        val uid = FirebaseAuth.getInstance().uid ?: ""
        val ref = FirebaseDatabase.getInstance().getReference("/users/$uid")

        val user = User(uid, et_name_register.text.toString(), profileImageUrl)

        ref.setValue(user)
            .addOnSuccessListener {
                Log.d("Registrasi", "Finally we saved the user to Firebase Database")
            }
    }
}

class User(val uid: String, val username: String, val profileImageUrl: String)