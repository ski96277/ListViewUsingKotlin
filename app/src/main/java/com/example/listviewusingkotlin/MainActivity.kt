package com.example.listviewusingkotlin

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = arrayOf("Imran", "Tamim", "Shifat", "SK", "Rahul")


        var age = arrayOf("25", "85", "15", "65", "45")
        var imrages = arrayOf(R.drawable.imran, R.drawable.siam, R.drawable.imran, R.drawable.siam, R.drawable.imran)

        var adapter = AdapterClass(this, name, age, imrages)
        list_view_ID.adapter = adapter

        //set Onclick on the item
        list_view_ID.onItemClickListener = AdapterView.OnItemClickListener(function = fun(
            adapterView: AdapterView<*>,
            view: View,
            position: Int,
            id: Long
        ) {
            Toast.makeText(this, "Click on " + position, Toast.LENGTH_SHORT).show()
        })

    }
}
