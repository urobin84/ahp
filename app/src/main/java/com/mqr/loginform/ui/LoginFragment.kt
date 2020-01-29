package com.mqr.loginform.ui


import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.auth.FirebaseAuth
import com.mqr.loginform.MainActivity
import com.mqr.loginform.R
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment(){

    companion object{
        const val TAG = "LoginFragment"
        const val SIGN_IN_RESULT_CODE = 1001

        fun newInstance()
        : LoginFragment {
            return LoginFragment()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_login, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_login.setOnClickListener{
            val email = et_email_login.text.toString()
            val password = et_password_login.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(context, "Please enter Text in Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Log.d("Login", "Email " + email )
            Log.d("Login", "Password " + password )

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener{
                    if (!it.isSuccessful) return@addOnCompleteListener

                    // else if successfull
                    Log.d("Main", "Successfully created user with uid: ${it.result?.user?.uid}")

                    val intent = Intent(context, MainActivity::class.java)
                        startActivity(intent)

                }
        }
    }



}