package ru.kotlin.a20012011144_raghavmalpanipractical6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId="MN8p-Vrn6G0"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val mywebview=findViewById<WebView>(R.id.web)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true

        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
        val button=findViewById<FloatingActionButton>(R.id.webfloat)
        button.setOnClickListener{
            Intent(this,MainActivity::class.java).apply{startActivity(this)}
    }
}
}