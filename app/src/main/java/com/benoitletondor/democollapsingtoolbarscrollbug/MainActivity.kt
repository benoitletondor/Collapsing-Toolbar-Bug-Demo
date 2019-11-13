package com.benoitletondor.democollapsingtoolbarscrollbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        // Make the header fullscreen (- status bar height)
        val layoutParams = header_content.layoutParams
        layoutParams.height =
            resources.displayMetrics.heightPixels - resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"))
    }
}
