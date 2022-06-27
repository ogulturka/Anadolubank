package com.example.anadolubank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val v1 = Villa("Villa Cells",R.drawable.villacells)
    val v2 = Villa("Villa Pan",R.drawable.villapan)
    val v3 = Villa("Villa Pol",R.drawable.villapol)
    val v4 = Villa("Villa Ogo",R.drawable.villaogo)
    val v5 = Villa("Villa Fun",R.drawable.villafun)

    val villalist = ArrayList<Villa>()

    var layoutManager : RecyclerView.LayoutManager?=null
    var adapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter

        villalist.add(v1)
        villalist.add(v2)
        villalist.add(v3)
        villalist.add(v4)
        villalist.add(v5)

        adapter.update(villalist)

    }

    class Villa(var villaName: String, var villaImage : Int)


}