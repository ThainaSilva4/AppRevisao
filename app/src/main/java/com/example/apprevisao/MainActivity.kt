package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick: Button = findViewById(R.id.buttonNEXT)
        btnClick.setOnClickListener{click()}
    }
    public fun click(){
        val edt1: EditText = findViewById(R.id.edt1)
        val edt2: EditText = findViewById(R.id.edt2)

        if( edt1.text.isNotEmpty() && edt2.text.isNotEmpty()){

            if(Integer.parseInt(edt1.text.toString()) > Integer.parseInt(edt2.text.toString()))
                Toast.makeText(this, "O campo 1 é maior que o campo 2", Toast.LENGTH_LONG).show()
            else if(Integer.parseInt(edt1.text.toString()) < Integer.parseInt(edt2.text.toString()))
                Toast.makeText(this, "O campo 1 é menor que o campo 2", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "O campo 1 é igual ao campo 2", Toast.LENGTH_LONG).show()
        }
    }




}