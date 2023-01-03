package com.example.dagger.viewmodels

import androidx.lifecycle.ViewModel
import com.example.dagger.R
import com.example.dagger.utils.StringCatalog
import javax.inject.Inject

class ProfileViewModel @Inject constructor(
    private val stringCatalog: StringCatalog
) : ViewModel() {

    fun getName() : String {
        return stringCatalog.getString(R.string.app_name)
    }
}