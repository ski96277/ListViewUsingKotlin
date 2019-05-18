package com.example.listviewusingkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_view.view.*

class AdapterClass(mainActivity: MainActivity, name: Array<String>, age: Array<String>, imrages: Array<Int>) :
    BaseAdapter() {

    var name = name
    var age = age
    var imrages = imrages
    var layoutInflater = LayoutInflater.from(mainActivity)

    override fun getItem(position: Int): Any {

        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
         }

    override fun getCount(): Int {
        return name.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view:View = layoutInflater.inflate(R.layout.item_view,parent,false);

        view.imageView_ID.setImageResource(imrages[position])
        view.textView_name_ID.text=name[position]
        view.textView_age_ID.text=age[position]

        return view


    }

}

