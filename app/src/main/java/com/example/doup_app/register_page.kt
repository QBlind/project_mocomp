package com.example.doup_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class register_page : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var text: EditText
    lateinit var rd: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

    }
}