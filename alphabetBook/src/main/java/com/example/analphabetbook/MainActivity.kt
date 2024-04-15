package com.example.analphabetbook

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


open class MainActivity : AppCompatActivity(){
    val MY_PREF = "MyPreferences"
    val prefs: SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //the resume method
        var activityClass: Class<*>
        //code for the buttons
        val button1 = findViewById<Button>(R.id.buttonA)
        val button2 = findViewById<Button>(R.id.buttonB)
        val button3 = findViewById<Button>(R.id.buttonC)
        val button4 = findViewById<Button>(R.id.buttonD)
        val button5 = findViewById<Button>(R.id.buttonE)
        val button6 = findViewById<Button>(R.id.buttonF)
        val button7 = findViewById<Button>(R.id.buttonG)
        val button8 = findViewById<Button>(R.id.buttonH)
        val button9 = findViewById<Button>(R.id.buttonI)
        val button10 = findViewById<Button>(R.id.buttonJ)
        val button11 = findViewById<Button>(R.id.buttonK)
        val button12 = findViewById<Button>(R.id.buttonL)
        val button13 = findViewById<Button>(R.id.buttonM)
        val button14 = findViewById<Button>(R.id.buttonN)
        val button15 = findViewById<Button>(R.id.buttonO)
        val button16 = findViewById<Button>(R.id.buttonP)
        val button17 = findViewById<Button>(R.id.buttonQ)
        val button18 = findViewById<Button>(R.id.buttonR)
        val button19 = findViewById<Button>(R.id.buttonS)
        val button20 = findViewById<Button>(R.id.buttonT)
        val button21 = findViewById<Button>(R.id.buttonU)
        val button22 = findViewById<Button>(R.id.buttonV)
        val button23 = findViewById<Button>(R.id.buttonW)
        val button24 = findViewById<Button>(R.id.buttonX)
        val button25 = findViewById<Button>(R.id.buttonY)
        val button26 = findViewById<Button>(R.id.buttonZ)

        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "0")
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "1")
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "2")
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "3")
            startActivity(intent)
        }
        button5.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "4")
            startActivity(intent)
        }
        button6.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "5")
            startActivity(intent)
        }
        button7.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "6")
            startActivity(intent)
        }
        button8.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "7")
            startActivity(intent)
        }
        button9.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "8")
            startActivity(intent)
        }
        button10.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "9")
            startActivity(intent)
        }
        button11.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "10")
            startActivity(intent)
        }
        button12.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "11")
            startActivity(intent)
        }
        button13.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "12")
            startActivity(intent)
        }
        button14.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "13")
            startActivity(intent)
        }
        button15.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "14")
            startActivity(intent)
        }
        button16.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "15")
            startActivity(intent)
        }
        button17.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "16")
            startActivity(intent)
        }
        button18.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "17")
            startActivity(intent)
        }
        button19.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "18")
            startActivity(intent)
        }
        button20.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "19")
            startActivity(intent)
        }
        button21.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "20")
            startActivity(intent)
        }
        button22.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "21")
            startActivity(intent)
        }
        button23.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "22")
            startActivity(intent)
        }
        button24.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "23")
            startActivity(intent)
        }
        button25.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "24")
            startActivity(intent)
        }
        button26.setOnClickListener{
            val intent = Intent(this@MainActivity, ImageActivity::class.java)
            intent.putExtra("name", "25")
            startActivity(intent)
        }
            3
            val prefs = getSharedPreferences("X", MODE_PRIVATE)
        }





    override fun onPause() {
        super.onPause()
        val prefs = getSharedPreferences("X", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = prefs.edit()
        editor.putString("lastActivity", javaClass.name)
        editor.commit()
    }




}