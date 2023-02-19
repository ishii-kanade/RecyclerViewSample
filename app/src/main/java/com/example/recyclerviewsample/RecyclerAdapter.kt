package com.example.recyclerviewsample

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsample.body.RecyclerItemBodyView
import com.example.recyclerviewsample.body.RecyclerItemBodyViewHolder
import com.example.recyclerviewsample.header.RecyclerItemHeaderView
import com.example.recyclerviewsample.header.RecyclerItemHeaderViewHolder

class RecyclerAdapter(
    private val context: Context,
    private val states: List<RecyclerState>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (RecyclerType.fromInt(viewType)) {
            RecyclerType.HEADER -> {
                val view = RecyclerItemHeaderView(context)
                return RecyclerItemHeaderViewHolder(view)
            }
            RecyclerType.BODY -> {
                val view = RecyclerItemBodyView(context)
                return RecyclerItemBodyViewHolder(view)
            }
            else -> {
                val view = RecyclerItemBodyView(context)
                return RecyclerItemBodyViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        if (viewHolder is RecyclerItemHeaderViewHolder) {
            viewHolder.update(states[position])
        }
        if (viewHolder is RecyclerItemBodyViewHolder) {
            viewHolder.update(states[position])
        }
    }

    override fun getItemCount(): Int {
        return states.count()
    }

    override fun getItemViewType(position: Int): Int {
        return states[position].type.int
    }
}