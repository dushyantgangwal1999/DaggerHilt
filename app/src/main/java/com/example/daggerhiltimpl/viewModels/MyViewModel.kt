package com.example.daggerhiltimpl.viewModels

import androidx.lifecycle.ViewModel
import com.example.daggerhiltimpl.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val myRepository: MyRepository
): ViewModel() {
}