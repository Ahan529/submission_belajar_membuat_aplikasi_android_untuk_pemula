package com.dicoding.kulinerjawabarat.kuliner

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.kulinerjawabarat.R

class KulinerAdapter(val listKuliner: ArrayList<Kuliner>) : RecyclerView.Adapter<KulinerAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.layout_kuliner, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val Kuliner = listKuliner[position]

        Glide.with(holder.itemView.context)
            .load(Kuliner.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = Kuliner.name
        holder.tvRate.text = Kuliner.rate

        Glide.with(holder.itemView.context)
                .load(Kuliner.star)
                .apply(RequestOptions().override(55,55))
                .into(holder.imgStar)
        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, KulinerDetail::class.java)
            moveDetail.putExtra(KulinerDetail.EXTRA_RATE, Kuliner.rate)
            moveDetail.putExtra(KulinerDetail.EXTRA_STAR, Kuliner.star)
            moveDetail.putExtra(KulinerDetail.EXTRA_NAME, Kuliner.name)
            moveDetail.putExtra(KulinerDetail.EXTRA_PHOTO, Kuliner.photo)
            moveDetail.putExtra(KulinerDetail.EXTRA_DETAIL, Kuliner.detail)
            moveDetail.putExtra(KulinerDetail.EXTRA_OVERVIEW, Kuliner.overview)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listKuliner.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRate: TextView = itemView.findViewById(R.id.tv_item_rate)
        var imgStar: ImageView = itemView.findViewById(R.id.img_item_stars)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}