package com.example.rickandmorty.utils.image_loader

import android.widget.ImageView
import com.example.rickandmorty.R
import com.example.rickandmorty.utils.ResourcesUtils

fun ImageView.loadImage(url: String) {
    ImageLoader
        .load(url)
        .error(R.drawable.image_placeholder)
        .placeholder(R.drawable.image_placeholder)
       // .centerCrop()
        .roundedCorners(ResourcesUtils.getPxByDp(4f))
        .into(this)
}
