package com.dicoding.kulinerjawabarat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.kulinerjawabarat.about.About
import com.dicoding.kulinerjawabarat.kuliner.Kuliner
import com.dicoding.kulinerjawabarat.kuliner.KulinerAdapter
import com.dicoding.kulinerjawabarat.kuliner.KulinerData

class MainActivity : AppCompatActivity() {
    private lateinit var rvKuliner: RecyclerView
    private var list: ArrayList<Kuliner> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Home"

        rvKuliner = findViewById(R.id.rv_kuliner)
        rvKuliner.setHasFixedSize(true)

        list.addAll(KulinerData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvKuliner.layoutManager = LinearLayoutManager(this)
        val kulinerAdapter = KulinerAdapter(list)
        rvKuliner.adapter = kulinerAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode){
            R.id.mimenu -> {
                val iAbout = Intent(this@MainActivity,
                    About::class.java)
                startActivity(iAbout)
            }
        }
    }
}