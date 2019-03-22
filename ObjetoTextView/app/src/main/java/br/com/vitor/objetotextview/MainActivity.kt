package br.com.vitor.objetotextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//Método disparado quando a janela é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    txvTexto.text = "Trabalhando com Textos"

    txvTexto2.text = "Olá estação Hack"
    }
}
