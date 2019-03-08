package com.matheustadeu.aplicativoteste

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var valor: Boolean = false;

        btn_nome.setOnClickListener {

            txvResultado.text = "Seja bem vindo Matheus ! "

            valor = true;

        }

    }
}
