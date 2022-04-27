package com.example.kotlincodechallenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import java.io.File
import java.util.*
import kotlin.collections.HashSet

class MainActivity : AppCompatActivity() {

    private val PREF_KEY = "PREF_KEY"
    private val PREF_KEY2 = "PREF_KEY2"

//    private val myPref =
//        this.getSharedPreferences(PREF_KEY, Context.MODE_PRIVATE)

//    var initMyPref: String
//        get() = myPref.getString(PREF_KEY, "string").toString()
//        set(value) = myPref.edit().putString(PREF_KEY, value).apply()
//
//    val editor : SharedPreferences.Editor = myPref.edit()
    var result = ""
    lateinit var tvLoginText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        window.apply {
//            setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//            addFlags()
//        }

        tvLoginText = findViewById(R.id.tv_login_text)

        if (savedInstanceState != null) {
            val flag = savedInstanceState.getBoolean(PREF_KEY2)
        }
        val btn = findViewById<Button>(R.id.btn_load_file)
        btn.setOnClickListener {

            val current = ""
            val inputStream = assets.open("myText.txt")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            result = String(buffer)
            findMaxWord()
            tvLoginText.text = result
        }

//        val intent = Intent(this, MainActivity::class.java)
//        intent.putExtra("KEY", tvLoginText.text.toString())
//        startActivity(intent)
    }

    private fun findMaxWord() {
        var result = ""
        var currentLongest: String
        val scan = Scanner(assets.open("myText.txt"))

        while (scan.hasNext()) {
            currentLongest = scan.next()
            if (currentLongest.length > result.length) {
                result = currentLongest
                Log.d("*****", "Result is $result")
            }
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.getBoolean(PREF_KEY2)
    }
}