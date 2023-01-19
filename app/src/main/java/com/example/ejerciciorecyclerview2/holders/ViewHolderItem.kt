package com.example.ejerciciorecyclerview2.holders


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciorecyclerview2.R
import com.example.ejerciciorecyclerview2.models.Dios

class ViewHolderItem (inflater: View): RecyclerView.ViewHolder(inflater) {
    val nombre = itemView.findViewById<TextView>(R.id.nombre)
    val descripcion = itemView.findViewById<TextView>(R.id.descripcion)
    //val imagen = itemView.findViewById<ImageView>(R.id.imageView)
    val activo = itemView.findViewById<TextView>(R.id.activo)

    fun render(item: Dios) {
        nombre.text = item.nombre
        descripcion.text = item.descripcion
        //imagen.setImageResource(item.imagen)
        activo.text = item.activo.toString()
    }

}