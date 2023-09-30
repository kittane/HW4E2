package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.ViewModel
import android.util.Log
import androidx.lifecycle.SavedStateHandle

const val TEAM_A_KEY = "TEAM_A_KEY"
const val TEAM_B_KEY = "TEAM_B_KEY"

class CourtViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var scoreTeamA: Int
    get() = savedStateHandle.get(TEAM_A_KEY) ?: 0
    set(value) = savedStateHandle.set(TEAM_A_KEY, value)
    var scoreTeamB: Int
    get() = savedStateHandle.get(TEAM_B_KEY) ?: 0
    set(value) = savedStateHandle.set(TEAM_B_KEY, value)


    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA() {
        scoreTeamA++
    }

    fun addTwoForTeamA() {
        scoreTeamA += 2
    }

    fun addThreeForTeamA() {
        scoreTeamA += 3
    }

    fun addOneForTeamB() {
        scoreTeamB++
    }

    fun addTwoForTeamB() {
        scoreTeamB += 2
    }

    fun addThreeForTeamB() {
        scoreTeamB += 3
    }


    }
