package org.d3if0021.hitungbmi.ui.hitung

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if0021.hitungbmi.db.BmiDao

class HitungViewModelFactory(
    private val db: BmiDao
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HistoriViewModel::class.java)) {
            return HistoriViewModel(db) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}