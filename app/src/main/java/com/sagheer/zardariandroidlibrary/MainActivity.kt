package com.sagheer.zardariandroidlibrary

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shortToast("sagheer")


    }

    fun shortToast(message: String) {
        Toast.makeText(application, message, Toast.LENGTH_SHORT).show()
    }

}
