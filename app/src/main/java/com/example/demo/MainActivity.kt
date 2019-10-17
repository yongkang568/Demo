package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

// : = extends
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO : Contnue here
        //Java int x; vs Kotlin var x : int
        //val = value and var = variable
        //findViewById = link UI to code

        val buttonDonClickMe : Button = findViewById(R.id.buttonDonClickMe)
        buttonDonClickMe.setOnClickListener { showMessage() }
    }

    private fun showMessage() {
        textViewMessage.setText(getString(R.string.warning_message))
    }
}
