package com.example.listviewexcerciseapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodlist= arrayOf("pizza 199","Burger 50","sandwich 50","Manchurian 80","Dabeli 30","Samosa 40","Idli 30","VadaPaw 25","Gufhra 40","Kachori 50")
        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,foodlist)
        val listview =findViewById<ListView>(R.id.listview)
        listview.adapter=arrayAdapter

        listview.setOnItemClickListener { adapterView, view, i, l ->

            val foodnameWithPrise=adapterView.getItemAtPosition(i) as String
            Toast.makeText(this,"$foodnameWithPrise",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,OrderActivity::class.java)
            intent.putExtra("foodnameWithPrise",foodnameWithPrise)
            startActivity(intent)
            finish()
        }
    }
}
