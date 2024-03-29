package edu.pe.idat.ec1_moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.pe.idat.ec1_moviles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEjer1.setOnClickListener(this)
        binding.btnEjer2.setOnClickListener(this)
        binding.btnEjer3.setOnClickListener(this)
        binding.btnEjer4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnEjer1){
            startActivity(Intent(this, Ejercicio1Activity::class.java))
        }else if (v.id == R.id.btnEjer2){
            startActivity(Intent(this, Ejercicio2Activity::class.java))
        }else if (v.id == R.id.btnEjer3){
            startActivity(Intent(this, Ejercicio3Activity::class.java))
        }else if (v.id == R.id.btnEjer4){
            startActivity(Intent(this, Ejercicio4Activity::class.java))
        }
    }
}