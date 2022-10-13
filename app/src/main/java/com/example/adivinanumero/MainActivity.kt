package com.example.adivinanumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.adivinanumero.databinding.ActivityMainBinding
import kotlin.random.Random

var secreto10:Int=Random.nextInt(1-11)
var secreto50:Int=Random.nextInt(1-51)
var secreto100:Int=Random.nextInt(1-101)
var dificultad:Int=1;
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*binding.seekBar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                binding.caja1.text = "Cambiando progreso"
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                binding.caja2.setText("Starting tracking")
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
                binding.caja2.setText("Stopping tracking")
                binding.caja1.setText(binding.seekBarDiscreta.progress.toString())
            }
        */



        binding.textView3.text=((binding.seekBar.progress)+1).toString()

        binding.btnBoton.setOnClickListener {
            secreto10=Random.nextInt(1-11)
            secreto50=Random.nextInt(1-51)
            secreto100=Random.nextInt(1-101)
            binding.txtMasOMenos.text=" "
        }

        binding.btnComprobar.setOnClickListener {


            when(dificultad){

                1->
                    if ((Integer.parseInt(binding.TextNumero.text.toString())<secreto10)){
                        binding.txtMasOMenos.text="Mayor"
                    }
                    else if ((Integer.parseInt(binding.TextNumero.text.toString())>secreto10)){
                        binding.txtMasOMenos.text="Menor"
                    }else{binding.txtMasOMenos.text="Exacto" }
                2->
                    if ((Integer.parseInt(binding.TextNumero.text.toString())<secreto50)){
                        binding.txtMasOMenos.text="Mayor"
                    }
                    else if ((Integer.parseInt(binding.TextNumero.text.toString())>secreto50)){
                        binding.txtMasOMenos.text="Menor"
                    }else{ binding.txtMasOMenos.text="Exacto"}

                3->
                    if ((Integer.parseInt(binding.TextNumero.text.toString())<secreto100)){
                        binding.txtMasOMenos.text="Mayor"
                    }
                    else if ((Integer.parseInt(binding.TextNumero.text.toString())>secreto100)){
                        binding.txtMasOMenos.text="Menor"
                    }else{ binding.txtMasOMenos.text="Exacto"}
            }
        }
    }

}
