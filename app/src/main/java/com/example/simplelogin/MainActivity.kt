package com.example.simplelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener(){
            if(email.text.length == 0 || password.text.length == 0){
                if(email.text.isEmpty()){
                    email.setError("por favor escribe tu email")
                }
                if(password.text.isEmpty()){
                    password.setError("Ingresa una password")
                }
            }else{
                val reply:String = "Username: " + email.text.toString() + " Password: " + password.text.toString()
                Toast.makeText(applicationContext,reply,Toast.LENGTH_SHORT).show()
            }
        }
    }
}