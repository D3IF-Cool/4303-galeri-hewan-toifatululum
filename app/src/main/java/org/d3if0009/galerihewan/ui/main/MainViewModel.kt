package org.d3if0009.galerihewan.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.d3if0009.galerihewan.R
import org.d3if0009.galerihewan.model.Hewan
import org.d3if0009.galerihewan.network.HewanApi
import java.lang.Exception

class MainViewModel : ViewModel() {

    private val data = MutableLiveData<List<Hewan>>()

    init {
        data.value = initData()
        retrieveData()
    }

    private fun retrieveData(){
        viewModelScope.launch {
            try {
                val result = HewanApi.service.getHewan()
                Log.d("MainViewModel", "Success: $result")
            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
            }
        }
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