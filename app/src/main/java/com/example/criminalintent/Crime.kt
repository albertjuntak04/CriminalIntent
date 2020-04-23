package com.example.criminalintent

import java.util.*

data class Crime(val id: UUID = UUID.randomUUID(),
                 val title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false) {
}