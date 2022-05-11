package edu.pe.idat.ec1_moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.pe.idat.ec1_moviles.databinding.ActivityEjercicio1Binding

class Ejercicio1Activity : AppCompatActivity(), View.OnClickListener {
    private lateinit var  binding: ActivityEjercicio1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcDscto.setOnClickListener(this)
        binding.btnVolver.setOnClickListener(this)
    }

    override fun onClick(v: View){
        if (v.id == R.id.btnCalcDscto){
            var precio = 11000
            var nrocomps = binding.etNroComp.text.toString().toInt()

            if (nrocomps == 0){
                binding.tvDsctoResult.text = "Debe ingresar al menos una computadora!"
                return
            }

            var pretotal = precio * nrocomps

            var dsctoporcentaje = if (nrocomps < 5){
                10.0
            } else if (nrocomps in 5..9){
                20.0
            } else {
                40.0
            }

            var dscto = (dsctoporcentaje / 100.0) * pretotal
            var total = pretotal - dscto

            binding.tvDsctoResult.text = "Pre-total: $$pretotal \n" +
                    "Descuento: $${dscto.toInt()} ($dsctoporcentaje%) \n" +
                    "Total: $${total.toInt()}"
        } else if (v.id == R.id.btnVolver){
            startActivity(Intent(this@Ejercicio1Activity, MainActivity::class.java))
        }
    }
}