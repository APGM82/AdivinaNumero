package com.example.adivinanumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.adivinanumero.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var dificultad:Int=1
        var adivinaFacil:Int=0
        var adivinaMedia:Int=0
        var adivinaDificil:Int=0
        binding.seekBar.progress=0
        binding.textView3.text="Fácil"
        binding.seekBar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                //binding.caja1.text = "Cambiando progreso"
            }
            override fun onStartTrackingTouch(seek: SeekBar) {
                //binding.caja2.setText("Starting tracking")
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
                //binding.caja2.setText("Stopping tracking")
                //binding.caja1.setText(binding.seekBarDiscreta.progress.toString())
                when(((binding.seekBar.progress)+1)){
                    1 ->
                        binding.textView3.text="Fácil"
                    2 ->
                        binding.textView3.text="Media"
                    3 ->
                        binding.textView3.text="Dificil"
                }
                dificultad=((binding.seekBar.progress)+1) //Esto al ponerlo me da error
                Log.e("Antonio ",binding.seekBar.progress.toString())
            }
        })
        dificultad=1
        binding.btnReiniciar.setOnClickListener {

        }

        binding.btnComprobar.setOnClickListener {
            when (dificultad) {
                1 -> {
                    adivinaFacil=Random.nextInt(1-11)
                    if ((Integer.parseInt(binding.TextNumero.text.toString())<adivinaFacil)){

                        binding.imageView.setImageResource(R.drawable.up)
                    } else if ((Integer.parseInt(binding.TextNumero.text.toString())>adivinaFacil)){

                        binding.imageView.setImageResource(R.drawable.down)
                    }else{

                        binding.imageView.setImageResource(R.drawable.win)
                    }
                }
                2 -> {
                    adivinaMedia=Random.nextInt(1-51)
                    if ((Integer.parseInt(binding.TextNumero.text.toString())<adivinaMedia)){

                        binding.imageView.setImageResource(R.drawable.up)
                    } else if ((Integer.parseInt(binding.TextNumero.text.toString())>adivinaMedia)){

                        binding.imageView.setImageResource(R.drawable.down)
                    }else{

                        binding.imageView.setImageResource(R.drawable.win)
                    }
                }
                3 -> {
                    adivinaDificil=Random.nextInt(1-101)
                    if ((Integer.parseInt(binding.TextNumero.text.toString())<adivinaDificil)){

                        binding.imageView.setImageResource(R.drawable.up)
                    } else if ((Integer.parseInt(binding.TextNumero.text.toString())>adivinaDificil)){

                        binding.imageView.setImageResource(R.drawable.down)
                    }else{

                        binding.imageView.setImageResource(R.drawable.win)
                    }
                }
            }
        }
    }

}
