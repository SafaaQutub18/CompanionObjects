package com.safaa.companionobjects

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safaa.companionobjects.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            changeBtn.setOnClickListener {
                val userInput = wordET.text.toString()
                val background = Backgrounds.changeBackground(userInput)

                if (background != 0) {
                    mainLayout.setBackgroundResource(background)
                    wordET.setText("")
                    textView.setTextColor(Color.WHITE)
                    wordET.setTextColor(Color.WHITE)
                }
            }
        }
    }
}