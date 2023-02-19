package com.example.recyclerviewsample.body

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsample.RecyclerState

class RecyclerItemBodyViewHolder(private val view: RecyclerItemBodyView) :
    RecyclerView.ViewHolder(view) {
    fun update(state: RecyclerState) {
        view.update(state)
    }
}