package com.gzeinnumer.kadecontentvaluektx

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.contentValuesOf

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val contentValues = ContentValues()
//        contentValues.put("COL_1" , "dicoding")
//        contentValues.put("COL_2" , "Indonesia")
//        contentValues.put("COL_3" , "085777888999")

        val contentvalues = contentValuesOf(
            "COL_1" to "dicoding",
            "COL_2" to "Indonesia",
            "COL_3" to "085777888999"
        )

        contentvalues.let {
            Log.d("MyZein",it["COL_1"].toString())
        }
    }

}
