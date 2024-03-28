package com.example.toolbox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val asciiList : ArrayList<Ascii_dataClass>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.ascii_list_item,
            parent,false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return asciiList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = asciiList[position]
        holder.txtDec.text = currentItem.dcDec
        holder.txtHex.text = currentItem.dcHex
        holder.txtCode.text = currentItem.dcCode
        holder.txtDesc.text = currentItem.dcDesc
    }




    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val txtDec : TextView = itemView.findViewById(R.id.textDec)
        val txtHex : TextView = itemView.findViewById(R.id.textHex)
        val txtCode : TextView = itemView.findViewById(R.id.textCode)
        val txtDesc : TextView = itemView.findViewById(R.id.textDesc)

    }
}