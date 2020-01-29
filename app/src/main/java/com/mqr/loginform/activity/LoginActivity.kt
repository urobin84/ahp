package com.mqr.loginform.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.mqr.loginform.MainActivity
import com.mqr.loginform.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)

        btn_login.setOnClickListener{
            val email = et_email_login.text.toString()
            val password = et_password_login.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Please enter Text in Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Log.d("Login", "Email " + email )
            Log.d("Login", "Password " + password )

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener{
                    if (!it.isSuccessful) return@addOnCompleteListener

                    // else if successfull
                    Log.d("Main", "Successfully created user with uid: ${it.result?.user?.uid}")

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                }
        }

    }
}