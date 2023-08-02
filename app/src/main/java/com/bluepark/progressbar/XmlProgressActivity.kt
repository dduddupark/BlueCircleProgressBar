package com.bluepark.progressbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bluepark.bluesemicircleprogressbar.databinding.LayoutXmlProgressBinding

class XmlProgressActivity : AppCompatActivity() {

    private lateinit var binding: LayoutXmlProgressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LayoutXmlProgressBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initProgressBar()
    }

    private fun initProgressBar() {
        for (i in 0..50) {
            binding.viewProgressbarCircle.setPercent(i)
        }
    }
}