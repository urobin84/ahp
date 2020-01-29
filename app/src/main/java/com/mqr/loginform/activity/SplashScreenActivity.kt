package com.mqr.loginform.activity

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat.startActivity
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.auth.FirebaseAuth
import com.mqr.loginform.LoginRegisterActivity
import com.mqr.loginform.MainActivity
import com.mqr.loginform.R
import com.mqr.loginform.ui.LoginFragment

class SplashScreenActivity : Activity(){
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        handler = Handler()
        handler.postDelayed({

        launchSignInFlow()

        }, 1500)
    }

    private fun launchSignInFlow() {
        // Give users the option to sign in / register with their email or Google account. If users
        // choose to register with their email, they will need to create a password as well.
        val providers = arrayListOf(
            AuthUI.IdpConfig.EmailBuilder().build(), AuthUI.IdpConfig.GoogleBuilder().build()
        )

        // Create and launch sign-in intent. We listen to the response of this activity with the
        // SIGN_IN_RESULT_CODE code.
        startActivityForResult(
            AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(
                providers
            ).build(), LoginFragment.SIGN_IN_RESULT_CODE
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LoginFragment.SIGN_IN_RESULT_CODE) {
            val response = IdpResponse.fromResultIntent(data)
            if (resultCode == Activity.RESULT_OK) {
                val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                startActivity(intent)
                // Successfully signed in user.
                Log.i(
                    ContentValues.TAG,
                    "Successfully signed in user " +
                            "${FirebaseAuth.getInstance().currentUser?.displayName}!"
                )
            } else {
                // Sign in failed. If response is null the user canceled the sign-in flow using
                // the back button. Otherwise check response.getError().getErrorCode() and handle
                // the error.
                Log.i(ContentValues.TAG, "Sign in unsuccessful ${response?.error?.errorCode}")

                    val intent = Intent(this@SplashScreenActivity, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
            }
        }
    }
}