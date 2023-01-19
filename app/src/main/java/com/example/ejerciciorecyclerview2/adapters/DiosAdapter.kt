package com.example.ejerciciorecyclerview2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciorecyclerview2.R
import com.example.ejerciciorecyclerview2.holders.ViewHolderItem
import com.example.ejerciciorecyclerview2.models.Dios
import com.example.ejerciciorecyclerview2.providers.DiosProviders

class DiosAdapter (context: Context) : RecyclerView.Adapter<ViewHolderItem>() {

    private val inflater = LayoutInflater.from(context)
    val item:List<Dios> = DiosProviders.dioses_del_olimpo

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        return ViewHolderItem(inflater.inflate(R.layout.dataitem, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        val item = item[position]
        holder.render(item)

    }

    override fun getItemCount(): Int {
        return item.size
    }


}
