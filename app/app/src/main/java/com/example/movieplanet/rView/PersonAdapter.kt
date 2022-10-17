package com.example.movieplanet.rView

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.movieplanet.R
import com.example.movieplanet.model.view_model.Person

class PersonAdapter (private val itemList: MutableList<Person>): RecyclerView.Adapter<PersonAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_person_design, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = itemList[position]
        holder.personName.text = model.name
        Glide.with(holder.itemView.context)
            .load("https://image.tmdb.org/t/p/w500/" + model.image_path)
            .placeholder(R.drawable.cropped_placeholder)
            .fitCenter()
            .transform(RoundedCorners(50))
            .into(holder.personImage)

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val personImage: ImageView = ItemView.findViewById(R.id.person_image)
        val personName: TextView = ItemView.findViewById(R.id.person_name)
    }
}