package com.bluepark.progressbar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bluepark.bluesemicircleprogressbar.databinding.LayoutMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: LayoutMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LayoutMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCompose.setOnClickListener {
            startActivity(Intent(this, ComposeProgressActivity::class.java))
        }

        binding.btnXml.setOnClickListener {
            startActivity(Intent(this, XmlProgressActivity::class.java))
        }

    }
}