package com.example.a20191221_04_pizzastorelistapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.a20191221_04_pizzastorelistapp.datas.PizzaStore

class PizzaAdapter(context: Context,resId:Int,list:ArrayList<PizzaStore>) {
    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        var tempRow = convertView
//
//        tempRow?.let {
//            tempRow = inf.inflate(R.layout.game_list_item, null)
//        }
//
//        val row = tempRow!!
//
//        val data = mList.get(position)
//
//        val gameTitleTxt = row.findViewById<TextView>(R.id.gameTitleTxt)
//        val gameCompanyTxt = row.findViewById<TextView>(R.id.gameCompanyTxt)
//
//        gameTitleTxt.text = data.title
//        gameCompanyTxt.text = data.companyName
//
//
//        return row

}