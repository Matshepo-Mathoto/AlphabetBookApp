package com.example.analphabetbook

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class ImageActivity : AppCompatActivity(){
    //val MY_PREF = "MyPreferences"

    var name: Int =0
    val prefs: SharedPreferences? = null
    //var imageView: ImageView? = null
    var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        //get support action bar
        //setSupportActionBar(mToolbar)


        val look = intent.getStringExtra("name")
        //trials for states
        name = Integer.parseInt(look)
        var imageView = findViewById<ImageView>(R.id.imageView)
        val image = arrayOf(BitmapFactory.decodeResource(resources,R.drawable.slide01),BitmapFactory.decodeResource(resources,R.drawable.slide02),BitmapFactory.decodeResource(resources,R.drawable.slide03), BitmapFactory.decodeResource(resources,R.drawable.slide04),BitmapFactory.decodeResource(resources,R.drawable.slide05),
            BitmapFactory.decodeResource(resources,R.drawable.slide06),BitmapFactory.decodeResource(resources,R.drawable.slide07),BitmapFactory.decodeResource(resources,R.drawable.slide08), BitmapFactory.decodeResource(resources,R.drawable.slide09),BitmapFactory.decodeResource(resources,R.drawable.slide10),
            BitmapFactory.decodeResource(resources,R.drawable.slide11),BitmapFactory.decodeResource(resources,R.drawable.slide12),BitmapFactory.decodeResource(resources,R.drawable.slide13), BitmapFactory.decodeResource(resources,R.drawable.slide14), BitmapFactory.decodeResource(resources,R.drawable.slide15),
            BitmapFactory.decodeResource(resources,R.drawable.slide16),BitmapFactory.decodeResource(resources,R.drawable.slide17),BitmapFactory.decodeResource(resources,R.drawable.slide18), BitmapFactory.decodeResource(resources,R.drawable.slide19),BitmapFactory.decodeResource(resources,R.drawable.slide20),
            BitmapFactory.decodeResource(resources,R.drawable.slide21),BitmapFactory.decodeResource(resources,R.drawable.slide22),BitmapFactory.decodeResource(resources,R.drawable.slide23), BitmapFactory.decodeResource(resources,R.drawable.slide24),BitmapFactory.decodeResource(resources,R.drawable.slide25),BitmapFactory.decodeResource(resources,R.drawable.slide26))

        imageView.setImageBitmap(image[name])
        //Buttons in this activity
        val button1 = findViewById<Button>(R.id.firstPageButton)
        val button2 = findViewById<Button>(R.id.lastPageButton)
        val button3 = findViewById<Button>(R.id.overviewButton)
        val button4 = findViewById<Button>(R.id.nextPageButton)
        val button5 = findViewById<Button>(R.id.previousPageButton)
        button1.setOnClickListener {
            //first page button
            name =0
            imageView.setImageBitmap(image[name])
        }
        button2.setOnClickListener {
            //last page button
            name =25
            imageView.setImageBitmap(image[name])
        }
        button3.setOnClickListener {
            //overview page button
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        button4.setOnClickListener {
            //next page button
            if(name != 25) {
                name++
                imageView.setImageBitmap(image[name])
            }
        }
        button5.setOnClickListener {
            //previous page button
            if(name !=0) {
                name--
                imageView.setImageBitmap(image[name])
            }

        }


    }
    /*override fun onResume() {
        super.onResume()
        var activityClass: Class<*>
        try {
            val prefs = getSharedPreferences("X", MODE_PRIVATE)
            activityClass = Class.forName(
                prefs.getString("lastActivity", ImageActivity::class.java.getName())
            )
        }catch (e:ClassNotFoundException)
        {
            activityClass = ImageActivity::class.java
        }
        startActivity(Intent(this, activityClass))

    }

    override fun onPause() {
        super.onPause()
        val prefs = getSharedPreferences("X", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = prefs.edit()
        editor.putString("lastActivity", javaClass.name)
        editor.commit()
    }*/
}