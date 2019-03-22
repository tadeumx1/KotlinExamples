package br.com.aula.onclickspinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Forma de trabalhar com o OnClick no Botão usando OnClickListener

        /* btn_verificar.setOnClickListener {
            txv_resultado.text = "Matheus"
        } */

        /* btn_verificar.setOnLongClickListener {
            txv_resultado.text = "Apertou o botão"

            true
        } */

        btn_verificar.setOnClickListener(this)

    }

    // Forma de trabalhar com o OnClick por método

    /* fun verificar(view : View) {

        txv_resultado.text = "Deu certo"

    } */

    // Trabalhando implementando a classe View em nossa Activity

    override fun onClick(v: View?) {

        // O v.id pode ser um valor null então caso fosse no Java deveríamos trabalhar com o Try Catch
        // No Kotlin podemos tratar null com ? ou !!

        val id = v?.id

        if(id == R.id.btn_verificar) {

            txv_resultado.text = "Terceira forma"

        }

        /* val Button = when(id) {
            R.id.btn_verificar -> { }
            else -> "Invalid ID"
        } */

        txv_resultado.text = "Terceira forma"

    }

}