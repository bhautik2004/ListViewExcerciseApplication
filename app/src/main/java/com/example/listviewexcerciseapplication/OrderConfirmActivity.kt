package com.example.listviewexcerciseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_order.foodn
import kotlinx.android.synthetic.main.activity_order.foodp
import kotlinx.android.synthetic.main.activity_order_confirm.*

class OrderConfirmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirm)
        val intent =getIntent()
        val foodname=intent.getStringExtra("foodname")
        val foodprise= intent.getStringExtra("foodprise")
        val foodquantity = intent.getStringExtra("foodquantity")
        foodn.text= foodname
        foodp.text=foodprise.toString()
        foodq.text=foodquantity.toString()
        val foodta= (foodprise!!.toInt() * foodquantity!!.toInt())
        totalamount.text = foodta.toString()
        val gohomebtn=findViewById<Button>(R.id.placeorderbtn)
        gohomebtn.setOnClickListener {

        }
    }
}
