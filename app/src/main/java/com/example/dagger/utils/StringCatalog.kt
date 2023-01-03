package com.example.dagger.utils

import android.content.Context
import androidx.annotation.StringRes
import javax.inject.Inject

class StringCatalog @Inject constructor(
    private val context: Context
) {
    fun getString(@StringRes resId: Int) : String {
        return context.getString(resId)
    }
}