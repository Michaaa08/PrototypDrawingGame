package com.example.drawinggametest

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.drawinggametest.PaintView.Companion.currentBrush

class MainActivity : AppCompatActivity() {
    companion object{
        var path = Path()
        val paintBrush = Paint()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)


        redBtn.setOnClickListener(){

            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener(){

            Toast.makeText(this,"Clicked!",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)

        }

        blackBtn.setOnClickListener(){

            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)


        }

        eraser.setOnClickListener(){

            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.WHITE
            currentColor(paintBrush.color)


        }
    }

    private fun currentColor(color:Int){
        currentBrush = color
        path = Path()
    }

}