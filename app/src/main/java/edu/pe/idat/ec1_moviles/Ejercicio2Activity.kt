package edu.pe.idat.ec1_moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.pe.idat.ec1_moviles.databinding.ActivityEjercicio2Binding

class Ejercicio2Activity : AppCompatActivity(), View.OnClickListener {
    private lateinit var  binding: ActivityEjercicio2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerMes.setOnClickListener(this)
        binding.btnVolver2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnVerMes){
            var numes = binding.etNumMes.text.toString().toInt()

            var nombremes = when(numes){
                1-> "Enero"
                2-> "Febrero"
                3-> "Marzo"
                4-> "Abril"
                5-> "Mayo"
                6-> "Junio"
                7-> "Julio"
                8-> "Agosto"
                9-> "Septiembre"
                10-> "Octubre"
                11-> "Noviembre"
                12-> "Diciembre"
                else-> "ERROR! Debe ingresar un número del 1 al 12"
            }

            binding.tvMes.text = "Nombre del mes: $nombremes"
        } else if (v.id == R.id.btnVolver2){
            startActivity(Intent(this@Ejercicio2Activity, MainActivity::class.java))
        }
    }
}