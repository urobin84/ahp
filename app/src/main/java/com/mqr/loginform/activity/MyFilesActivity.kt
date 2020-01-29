package com.mqr.loginform.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.mqr.loginform.R
import kotlinx.android.synthetic.main.activity_myfile_menu.*

class MyFilesActivity: AppCompatActivity() {
    companion object {
        private const val ACTIVITY_CHOOSE_FILE = 101
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myfile_menu)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "My Files"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)




        LLButtonUpload.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View) {
//                Toast.makeText(this@MyFilesActivity, "Click Upload Button", Toast.LENGTH_SHORT).show()
                selectFilesForUpload()
            }

        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    /**
     * Launches file/files pick intent.
     */
    private fun selectFilesForUpload() {
        val chooseFile = Intent(Intent.ACTION_GET_CONTENT).apply {
            type = "image/*"
            putExtra(Intent.EXTRA_LOCAL_ONLY, true)
            putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
        }
        val intent = Intent.createChooser(chooseFile,
            resources.getString(R.string.activity_main_choose_file))
        startActivityForResult(intent, ACTIVITY_CHOOSE_FILE)
    }
}
