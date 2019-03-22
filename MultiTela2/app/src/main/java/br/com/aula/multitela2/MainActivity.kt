package br.com.aula.multitela2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_entrar.setOnClickListener {

            // Obtendo os valores do EdiText

            var nome = edt_nome.editableText.toString().trim()
            var senha = edt_senha.editableText.toString().trim()

            if(nome.isNotEmpty() && senha.isNotEmpty()) {

                // Passagem de informações para próxima tela

                val intent = Intent(this, Tela2::class.java)
                intent.putExtra("Nome", nome)
                startActivity(intent)

            } else {

                Toast.makeText(this, "Digite as informações", Toast.LENGTH_LONG).show()

            }

        }

    }
}
