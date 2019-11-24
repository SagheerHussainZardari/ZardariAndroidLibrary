package com.sagheer.zardariandroidlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sagheer.zardarilibrary.longToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        longToast("Sagheer Zardari")

    }


}
