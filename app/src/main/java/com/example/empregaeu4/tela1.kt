package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.view.LayoutInflater
import com.example.empregaeu4.databinding.ActivityTela1Binding

class tela1 : AppCompatActivity() {
    private lateinit var binding: ActivityTela1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_tela1)
        binding = ActivityTela1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val edButton = binding.button2
        edButton.setOnClickListener {
            val intent = Intent(this, tela1::class.java)
            startActivity(intent)
        }
    }
}