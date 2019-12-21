package com.example.a20191221_04_pizzastorelistapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.a20191221_04_pizzastorelistapp.R
import com.example.a20191221_04_pizzastorelistapp.datas.PizzaStore

class PizzaAdapter(context: Context,resId:Int,list:ArrayList<PizzaStore>) :
    ArrayAdapter<PizzaStore>(context, resId, list){
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = inf.inflate(R.layout.pizza_store_list, null)

        }

        val row = tempRow!!

        val data = mList.get(position)

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val logoImg = row.findViewById<ImageView>(R.id.logoImg)

        Glide.with(mContext).load(data.logoUrl).into(logoImg)

        nameTxt.text = data.storeName



        return row
    }
}