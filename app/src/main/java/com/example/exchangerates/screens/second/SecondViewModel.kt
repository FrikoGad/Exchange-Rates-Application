package com.example.exchangerates.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exchangerates.data.repository.Repository
import com.example.exchangerates.model.cashless.Cashless
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Cashless>> = MutableLiveData()

    fun getCashlessMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getCashlessMoney()
        }
    }
}