package com.example.madlevel4task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val products: List<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(products[position])
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //  val binding = ItemReminderBinding.bind(itemView)

        fun databind(reminder: Product) {
            //itemView.tvReminder.text = reminder.reminderText
        }
    }


}