package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var user: String = "admin"
var password: String = "password"
lateinit var inputusername: String
lateinit var inputuserpassword: String

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonlogin.setOnClickListener() {

            inputusername = editTextTextuserName.text.toString()
            inputuserpassword = editTextTextPassword.text.toString()
            if (inputusername.equals(user) && inputuserpassword.equals(password)){
                Log.d("reached","test")
                val intent = Intent(this, loggedIn::class.java)
                intent.putExtra("Username", inputusername)
                startActivity(intent)
            }
            else{
                Toast.makeText(
                    this,
                    "failed to login",
                    Toast.LENGTH_SHORT
                ).show()
            }



        }


    }
}

