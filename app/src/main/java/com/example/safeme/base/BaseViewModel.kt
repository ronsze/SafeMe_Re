package com.example.safeme.base

import androidx.lifecycle.AndroidViewModel

abstract class BaseViewModel constructor(
    val commonComponent: CommonComponent
): AndroidViewModel(commonComponent.application) {

}