package com.example.homenavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mensagem1 = findViewById<TextView>(R.id.texto1)
        val callButtonMensage = findViewById<Button>(R.id.button1)

        var numero: Int
            mensagem1.toString()
            mensagem1.text = when {

                mensagem1<10->{
                    "geio"

            }


                else -> {
                    "voce eh feio"

                }                }
            }


}

private operator fun View.compareTo(i: Int): Int {
return 0
}

