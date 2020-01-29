package com.mqr.loginform


import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.auth.FirebaseAuth
import com.mqr.loginform.ui.LoginFragment
import com.mqr.loginform.ui.RegisterFragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.mainloginregister.*



class LoginRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainloginregister)

        viewPager.adapter = AuthenticationPagerAdapter(supportFragmentManager)
    }

}

class AuthenticationPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        LoginFragment(),
        RegisterFragment()
    )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Login"
            else -> "Register"
        }
    }
}

