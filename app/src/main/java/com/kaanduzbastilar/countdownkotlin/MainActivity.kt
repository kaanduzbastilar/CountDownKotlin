 package com.kaanduzbastilar.countdownkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.kaanduzbastilar.countdownkotlin.databinding.ActivityMainBinding

 private lateinit var binding:ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Abstract - Interface - Inheritence

        object : CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
                binding.textView.text = "Left : ${p0 / 1000}"
            }

            override fun onFinish() {
                binding.textView.text = "Left : 0 "
            }

        }.start()

    }
}