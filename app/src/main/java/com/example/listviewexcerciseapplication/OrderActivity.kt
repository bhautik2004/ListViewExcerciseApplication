package com.example.listviewexcerciseapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        val intent =getIntent()
        val foodnameWithPrise=intent.getStringExtra("foodnameWithPrise")
        val food= foodnameWithPrise?.split(" ")
        val foodname= food?.get(0)
        val foodprise= food?.get(1)
        val foodp=findViewById<TextView>(R.id.foodp)
        val foodn=findViewById<TextView>(R.id.foodn)
        val foodq = findViewById<TextView>(R.id.FoodQuantity)
        foodp.text=foodprise
        foodn.text=foodname

        placeorderbtn.setOnClickListener {
            val intent = Intent(this,OrderConfirmActivity::class.java)
            intent.putExtra("foodname",foodname)
            intent.putExtra("foodprise",foodprise)
            intent.putExtra("foodquantity",foodq.getText().toString())
            startActivity(intent)
        }





    }
}
