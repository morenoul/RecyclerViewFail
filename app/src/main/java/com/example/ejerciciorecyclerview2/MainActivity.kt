package com.example.ejerciciorecyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciorecyclerview2.adapters.DiosAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()

    }

    fun initRecyclerView() {
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerMain)
        recyclerView.adapter = DiosAdapter(this)
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
    }
}