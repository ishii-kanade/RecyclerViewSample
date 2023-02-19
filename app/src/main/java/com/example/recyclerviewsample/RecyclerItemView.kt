package com.example.recyclerviewsample

import android.content.AttributionSource
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView

class RecyclerItemView constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    private val textView: TextView

    init {
        val rootView = LayoutInflater.from(context).inflate(R.layout.recycler_item_view, this)
        textView = rootView.findViewById(R.id.recycler_item_text)
        setOnClickListener {

        }
    }

    fun update(state: RecyclerState) {
        textView.text = state.text
    }
}