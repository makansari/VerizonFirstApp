package com.example.verizonfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener {

           var username = editTextUsername.text.toString()

            Toast.makeText(this,"Username is : $username",Toast.LENGTH_LONG).show()
            textViewUsername.setText(username)

            var myIntent = Intent(this,SecondActivity::class.java)
            myIntent.putExtra("keyusername",username)
            startActivity(myIntent)
        }
    }
}