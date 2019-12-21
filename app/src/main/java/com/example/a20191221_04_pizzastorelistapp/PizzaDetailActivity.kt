package com.example.a20191221_04_pizzastorelistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_pizza_detail.*

class PizzaDetailActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        val imageURL = intent.getStringArrayExtra("imgURL")

        Glide.with(mContext).load(imageURL).into(logoImg)
    }

}
