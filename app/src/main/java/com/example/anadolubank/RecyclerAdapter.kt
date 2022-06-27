package com.example.anadolubank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerAdapter() : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val villaList = mutableListOf<MainActivity.Villa>()

    fun update(list: List<MainActivity.Villa>) {
        villaList.clear()
        villaList.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).
        inflate(R.layout.row_villa_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, bindingAdapterPosition: Int) {
        holder.bind(villaList[bindingAdapterPosition])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var villaImage: ImageView
        var villaName: TextView

        init {
            villaImage = itemView.findViewById(R.id.villaImage)
            villaName = itemView.findViewById(R.id.villaName)
        }
        fun bind(villa: MainActivity.Villa) {
            villaName.text = villaList[bindingAdapterPosition].villaName
            Glide.with(itemView).load(villaList[bindingAdapterPosition].villaImage).into(villaImage)
        }
    }

    override fun getItemCount(): Int {
        return villaList.size

    }



}


