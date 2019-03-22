package br.com.aula.multitelas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tela2.setOnClickListener {

            // val intent = Intent(this, Tela2::class.java)
            // startActivity(intent)

            // startActivity(Intent(this, Tela2::class.java))

        }

    }
}
