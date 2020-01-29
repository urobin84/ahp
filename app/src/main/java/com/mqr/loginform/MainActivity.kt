package com.mqr.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mqr.loginform.activity.ListAnnouncementActivity
import com.mqr.loginform.activity.MyFilesActivity

import com.mqr.loginform.entity.*
import com.mqr.loginform.factory.ItemTypeFactoryImpl
import com.mqr.loginform.base.BaseListAdapter
import com.mqr.loginform.ui.AkunFragment
import com.mqr.loginform.ui.EmployeeFragment
import com.mqr.loginform.ui.HomeFragment
import com.mqr.loginform.ui.InboxFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_overview_announcement.*
import kotlinx.android.synthetic.main.item_overview_menu.*
import java.security.AccessController

class MainActivity : AppCompatActivity() {

    lateinit var adapter: BaseListAdapter
//    lateinit var toolbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.framelayout)
        supportActionBar?.hide()

//        toolbar = supportActionBar!!
        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

//        lblViewAllAnnouncement.setOnClickListener{
//            val intent = Intent(it.context, ListAnnouncementActivity::class.java)
////            intent.putExtra("user", user)
//            it.context.startActivity(intent)
//        }

    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bb_menu_home -> {

                    val fragment = HomeFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bb_menu_employee -> {

                    val fragment = EmployeeFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bb_menu_inbox -> {

                    val fragment = InboxFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bb_menu_account -> {

                    val fragment = AkunFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }
}
