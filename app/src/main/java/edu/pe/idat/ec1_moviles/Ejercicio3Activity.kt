package edu.pe.idat.ec1_moviles

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import edu.pe.idat.ec1_moviles.databinding.ActivityEjercicio3Binding
import java.lang.Exception

class Ejercicio3Activity : AppCompatActivity(), View.OnClickListener {
    private lateinit var  binding: ActivityEjercicio3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalcular.setOnClickListener(this)
        binding.btnVolver3.setOnClickListener(this)
    }

    override fun onClick(v : View) {
        if (v.id == R.id.btnCalcular){
            var monto:Int
            monto = try {
                binding.txtMonto.text.toString().toInt()
            }catch (e:Exception){
                0
            }

            var bonificacion = when(monto){
                in 0..1000 -> monto*0.10
                in 1001..2000 -> monto * 0.20
                in 2001..3000 -> monto * 0.30
                else -> 0
            }

            var total = monto + bonificacion.toDouble()

            AlertDialog.Builder(v.context)
                .setTitle("Resultado")
                .setMessage("Su Bonificación es $$bonificacion\n" +
                            "Total: $$total")
                .setPositiveButton("OK"){ dialog, _ -> dialog.dismiss() }
                .show()
        } else if (v.id == R.id.btnVolver3) {
            startActivity(Intent(this@Ejercicio3Activity, MainActivity::class.java))
        }
    }
}