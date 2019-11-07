package com.csamson.pokedex

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.marginEnd
import androidx.core.view.marginStart
import androidx.core.view.setPadding
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"
    private val imageExtension = ".png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var layout= findViewById<GridLayout>(R.id.imageLayout)
        for (i in 1..10) {
            val completeImageUrl = imageUrl + i + imageExtension
            val image = ImageView(this)
            Glide.with(imageLayout).load(completeImageUrl).into(image);
            image.layoutParams = android.view.ViewGroup.LayoutParams(500, 500)
            image.maxHeight = 500
            image.maxWidth = 500
            image.background = getDrawable(R.drawable.pokebox)


            // Adds the view to the layout
            layout.addView(image)
        }
    }
}
