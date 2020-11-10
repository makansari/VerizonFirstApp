package com.example.verizonfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.w("mytag","SecondActivity created")


//       var result = intent.extras?.getString("keyusername")
//        textViewSecondResult.setText(result)

        textViewSecondResult.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }


    override fun onStart() {
        super.onStart()

        Log.w("mytag","SecondActivity Started")

    }

    override fun onResume() {
        super.onResume()

        Log.i("mytag","SecondActivity Resumed")

    }

    override fun onPause() {
        super.onPause()

        Log.i("mytag","SecondActivity Paused")

    }

    override fun onStop() {
        super.onStop()

        Log.i("mytag","SecondActivity Stopped")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("mytag","SecondActivity Destoryed")

    }

    override fun onRestart() {
        super.onRestart()

        Log.i("mytag","SecondActivity Restarted")

    }
}