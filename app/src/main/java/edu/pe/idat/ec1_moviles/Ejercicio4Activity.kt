package edu.pe.idat.ec1_moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.pe.idat.ec1_moviles.databinding.ActivityEjercicio4Binding

class Ejercicio4Activity : AppCompatActivity(), View.OnClickListener {
    private lateinit var  binding: ActivityEjercicio4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcFact.setOnClickListener(this)
        binding.btnVolver4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnCalcFact){
            var numero = binding.etNumero.text.toString().toInt()
            var fact = 1L

            for (i in 1..numero){
                fact *= i.toLong()
            }

            binding.tvFactorial.text = "Factorial de $numero ($numero!): $fact"
        } else if (v.id == R.id.btnVolver4){
            startActivity(Intent(this@Ejercicio4Activity, MainActivity::class.java))
        }
    }
}