package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }

    // this is called when ViewModel is about to be destroyed
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameviewModel destroyed")
    }
}