package com.example.recyclerviewsample.header

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsample.RecyclerState

class RecyclerItemHeaderViewHolder(private val view: RecyclerItemHeaderView): RecyclerView.ViewHolder(view) {
    fun update(state: RecyclerState) {
        view.update(state)
    }
}