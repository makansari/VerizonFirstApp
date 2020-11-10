package com.example.verizonfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("mytag","MainActivity Created")
        buttonSubmit.setOnClickListener {

          /* var username = editTextUsername.text.toString()

            Toast.makeText(this,"Username is : $username",Toast.LENGTH_LONG).show()
            textViewUsername.setText(username)

            var myIntent = Intent(this,SecondActivity::class.java)
            myIntent.putExtra("keyusername",username)
            startActivity(myIntent)*/
            var myIntent = Intent(this,SecondActivity::class.java)

            startActivity(myIntent)

           /* var myIntent = Intent("karthik")
            startActivity(myIntent)*/

          /*  var myIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:98585858585"))
            startActivity(myIntent)*/

          /*  var myIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:98585858585"))
            startActivity(myIntent)*/
            /*var myIntent = Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"))
            startActivity(myIntent)*/


        }
    }

    override fun onStart() {
        super.onStart()

        Log.w("mytag","MainActivity Started")

    }

    override fun onResume() {
        super.onResume()

        Log.i("mytag","MainActivity Resumed")

    }

    override fun onPause() {
        super.onPause()

        Log.i("mytag","MainActivity Paused")

    }

    override fun onStop() {
        super.onStop()

        Log.i("mytag","MainActivity Stopped")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("mytag","MainActivity Destoryed")

    }

    override fun onRestart() {
        super.onRestart()

        Log.i("mytag","MainActivity Restarted")

    }
}
