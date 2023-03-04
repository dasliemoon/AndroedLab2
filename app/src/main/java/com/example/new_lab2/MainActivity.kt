package com.example.new_lab2
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.new_lab2.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val a: Double
            val b: Double
            val c: Double
            val x1: Double
            val x2: Double
            binding.textOut.text = ""

            val s1 = binding.koef1.text.toString().toDouble()
            val s2 = binding.koef2.text.toString().toDouble()
            val s3 = binding.koef3.text.toString().toDouble()

            val d: Double = s2 * s2 - 4 * s1 * s3
            if (d >= 0) {
                x1 = (-s2 + sqrt(d)) / (2 * s1)
                x2 = (-s2 - sqrt(d)) / (2 * s1)
                binding.textOut.text = "x1 = $x1  x2 = $x2   d = $d"
            } else binding.textOut.text = ("Корней нет. Дискриминант меньше нуля!"
                    + "  d = " + d)
        }
    }
}