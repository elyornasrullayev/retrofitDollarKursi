package com.ensoft.retrofitdollarkursi.adapter

import android.graphics.Color.GRAY
import android.graphics.Color.GREEN
import android.graphics.Color.RED
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ensoft.retrofitdollarkursi.R
import com.ensoft.retrofitdollarkursi.data.User


class RvAdapter(val list: List<User>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageGrow = itemView.findViewById<ImageView>(R.id.img_grow)
        fun onBind(user: User){
            val tv_valyuta_nomi = itemView.findViewById<TextView>(R.id.tv_valyuta_nomi)
            val tv_rate = itemView.findViewById<TextView>(R.id.tv_rate)
            val tv_diff = itemView.findViewById<TextView>(R.id.tv_diff)
            tv_valyuta_nomi.text = user.ccy
            tv_rate.text = user.rate
            tv_diff.text = user.diff
            var id = user.id
            val img = itemView.findViewById<ImageView>(R.id.imageview)
            //bu seryozni commit ukajonim

            when {
                user.diff!!< 0.toString() -> {

                    tv_diff.setTextColor(RED)
                    imageGrow.setImageResource(R.drawable.grow_down)
                }
                user.diff> 0.toString() -> {
                    tv_diff.setTextColor(GREEN)
                    imageGrow.setImageResource(R.drawable.grow_up)
                }
                else -> {
                    tv_diff.setTextColor(GRAY)
                    imageGrow.setImageResource(R.drawable.zero)
                }
            }
            when(id){
                69 -> {
                    img.setImageResource(R.drawable.usa)
                }
                21 -> {
                    img.setImageResource(R.drawable.euro)
                }
                57 -> {
                    img.setImageResource(R.drawable.rub)
                }
                22 -> {
                    img.setImageResource(R.drawable.gbp)
                }
                33 -> {
                    img.setImageResource(R.drawable.jpy)
                }
                1 -> {
                    img.setImageResource(R.drawable.aed)
                }
                3 -> {
                    img.setImageResource(R.drawable.amd)
                }
                6 -> {
                    img.setImageResource(R.drawable.az)
                }
                7 -> {
                    img.setImageResource(R.drawable.bd)
                }
                8 -> {
                    img.setImageResource(R.drawable.bg)
                }
                9 -> {
                    img.setImageResource(R.drawable.bhd)
                }
                10 -> {
                    img.setImageResource(R.drawable.bn)
                }
                11 -> {
                    img.setImageResource(R.drawable.br)
                }
                12 -> {
                    img.setImageResource(R.drawable.by)
                }
                13 -> {
                    img.setImageResource(R.drawable.cad)
                }
                14 -> {
                    img.setImageResource(R.drawable.chf)
                }
                else -> {
                    img.setImageResource(R.drawable.usa)
                }
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
