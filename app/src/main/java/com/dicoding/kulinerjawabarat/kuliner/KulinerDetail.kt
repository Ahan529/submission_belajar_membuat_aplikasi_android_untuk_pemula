package com.dicoding.kulinerjawabarat.kuliner

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.kulinerjawabarat.R

class KulinerDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_detail_kuliner)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Kuliner"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetIden: TextView = findViewById(R.id.tv_set_detail)
        val tvOverview: TextView = findViewById(R.id.tv_set_overview)
        val tvRate: TextView = findViewById(R.id.tv_item_rate)
        val imgsetStar: ImageView = findViewById(R.id.img_item_stars)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tIDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tOverview = intent.getStringExtra(EXTRA_OVERVIEW)
        val tRate = intent.getStringExtra(EXTRA_RATE)
        val tStar = intent.getIntExtra(EXTRA_STAR, 0)


        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetIden.text = tIDetail
        tvOverview.text = tOverview
        tvRate.text = tRate
        Glide.with(this)
                .load(tStar)
                .apply(RequestOptions())
                .into(imgsetStar)
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_OVERVIEW = "extra_overview"
        const val EXTRA_RATE = "extra_rate"
        const val EXTRA_STAR = "extra_star"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}