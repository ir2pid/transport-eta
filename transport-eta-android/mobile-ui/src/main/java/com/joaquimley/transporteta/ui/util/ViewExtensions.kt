package com.joaquimley.transporteta.ui.util

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

fun View.setVisible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun ImageView.load(resourceId: Int) {
    Glide.with(context)
            .load(resourceId)
            .into(this)
}

fun <T, VH : RecyclerView.ViewHolder> ListAdapter<T, VH>.isEmpty() = itemCount == 0

fun <T, VH : RecyclerView.ViewHolder> ListAdapter<T, VH>.clear() {
    submitList(null)
}

//private fun android.support.v7.app.AlertDialog.setButton(whichButton: Int, @StringRes stringResource: Int, function: () -> Unit) {
//   setButton(whichButton, context.getString(stringResource), function)
//}