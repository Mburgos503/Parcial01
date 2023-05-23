package com.example.parcial_00063121.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_00063121.R
import com.example.parcial_00063121.data.Parque
import com.example.parcial_00063121.data.model.ParquesViewHolder

class ParquesAdapter(private val parque: List<Parque>) : RecyclerView.Adapter<ParquesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParquesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_parque,parent, false)
        return ParquesViewHolder(view)    }

    override fun getItemCount(): Int {
        return parque.size
    }

    override fun onBindViewHolder(holder: ParquesViewHolder, position: Int) {
    }
}