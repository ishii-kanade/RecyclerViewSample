package com.example.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val states = arrayListOf<RecyclerState>()

        states.add(RecyclerState(RecyclerType.HEADER, "header"))

        for (i in 0..10) {
            states.add(RecyclerState(RecyclerType.BODY, "Item $i"))
        }
        val adapter = RecyclerAdapter(this, states)
        val recycler = findViewById<RecyclerView>(R.id.recycler_view)

        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = adapter
    }
}