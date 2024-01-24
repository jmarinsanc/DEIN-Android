package com.example.botonparapasardepagina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FormularioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
    }
    fun goMain(view: View){
        finish()
    }
}