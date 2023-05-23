package com.example.parcial_00063121.data.model

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_00063121.R
import com.example.parcial_00063121.data.Parque

class ParquesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvParqueTitle : TextView = view.findViewById(R.id.tvTitleParque)
    private val tvParqueUbi : TextView = view.findViewById(R.id.tvParqueUbi)

    fun render(parque: Parque) {
        tvParqueTitle.text = parque.name
        tvParqueUbi.text = parque.ubi

    }

}


//private val tvTask: TextView = view.findViewById(R.id.tvTask)
//private val cbTask: CheckBox = view.findViewById(R.id.cbTask)


