package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button)
    }

    fun alert(view : View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Alert Dialog")
        alert.setMessage("This is an alert dialog")
        alert.setPositiveButton("Yes"){dialog, which ->
            Toast.makeText(applicationContext,"Yes",Toast.LENGTH_SHORT).show()
        }
        alert.setNegativeButton("No"){dialog, which ->
            Toast.makeText(applicationContext,"No",Toast.LENGTH_SHORT).show()
        }
        alert.setNeutralButton("Cancel"){dialog, which ->
            // Do something when user press the neutral button
        }
        alert.show()
    }
}