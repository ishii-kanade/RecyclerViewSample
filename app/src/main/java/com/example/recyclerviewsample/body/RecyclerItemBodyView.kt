package com.example.recyclerviewsample.body

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import com.example.recyclerviewsample.R
import com.example.recyclerviewsample.RecyclerState

class RecyclerItemBodyView constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {
    private val textView: TextView

    init {
        val rootView =
            LayoutInflater.from(context).inflate(R.layout.recycler_item_body_view, this)
        textView = rootView.findViewById(R.id.recyclerItemSectionText)
        setOnClickListener {
            // クリック処理
        }
    }

    fun update(state: RecyclerState) {
        textView.text = state.text
    }
}