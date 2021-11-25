package com.shra1wable.librarydemx

import android.content.Context
import android.widget.Toast

object Util {
    fun toastx(context: Context, text:String){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}