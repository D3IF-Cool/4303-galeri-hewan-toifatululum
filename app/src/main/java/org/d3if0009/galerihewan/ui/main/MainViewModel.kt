package org.d3if0009.galerihewan.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if0009.galerihewan.R
import org.d3if0009.galerihewan.model.Hewan

class MainViewModel : ViewModel() {

    private val data = MutableLiveData<List<Hewan>>()

    init {
        data.value = initData()
    }

    private fun initData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor", "Unggas", R.drawable.angsa),
            Hewan("Ayam", "Gallus gallus", "Unggas", R.drawable.ayam),
            Hewan("Bebek", "Cairina moschata", "Unggas", R.drawable.bebek),
            Hewan("Domba", "Ovis ammon", "Mamalia", R.drawable.domba),
            Hewan("Kalkun", "Meleagris gallopavo", "Unggas", R.drawable.kalkun),
            Hewan("Kambing", "Capriconis sumatranesis", "Mamalia", R.drawable.kambing),
            Hewan("Kelinci", "Oryctolagus cuniculus", "Mamalia", R.drawable.kelinci),
            Hewan("Kerbau", "Bubalus bubalis", "Mamalia", R.drawable.kerbau),
            Hewan("Kuda", "Equus caballus", "Mamalia", R.drawable.kuda),
            Hewan("Sapi", "Bos taurus", "Mamalia", R.drawable.sapi)
        )
    }

    fun getData() : LiveData<List<Hewan>> = data
}