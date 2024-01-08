package com.example.googleassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.googleassistant.assistant.AssistantActivity
import com.example.googleassistant.assistant.ExploreActivity
import com.example.googleassistant.functions.GoogleLens

import com.example.googleassistant.utils.Utils.setCustomActionBar

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var hiGoogle : ImageView
    private lateinit var googleLens :ImageView
    private lateinit var explore : ImageView
    private val Record_Audio_Request_Code: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setCustomActionBar(supportActionBar, this)
        imageView = findViewById(R.id.action_button)
        googleLens= findViewById(R.id.action_google_lens)
        explore = findViewById(R.id.action_explore)
        hiGoogle= findViewById(R.id.hiGoogle)
        if (ContextCompat.checkSelfPermission(this,
            android.Manifest.permission.RECORD_AUDIO) != PERMISSION_GRANTED){
            checkPermission()
        }
        imageView.setOnClickListener{
            startActivity(Intent(this, AssistantActivity::class.java))
        }

        hiGoogle.setOnClickListener{
            startActivity(Intent(this, AssistantActivity::class.java))
        }

        googleLens.setOnClickListener {
            startActivity(Intent(this, GoogleLens::class.java))
        }

        explore.setOnClickListener {
            startActivity(Intent(this, ExploreActivity::class.java))
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode==Record_Audio_Request_Code && grantResults.isNotEmpty())
        {
            if (grantResults[0]== PERMISSION_GRANTED)
            {
                Toast.makeText(this,"Permission Granted", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun checkPermission() {
        ActivityCompat.requestPermissions(this,
            arrayOf(android.Manifest.permission.RECORD_AUDIO),
            Record_Audio_Request_Code
        )
    }
}