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

        } else if (v.id == R.id.btnVolver2){
            startActivity(Intent(this@Ejercicio2Activity, MainActivity::class.java))
        }
    }
}