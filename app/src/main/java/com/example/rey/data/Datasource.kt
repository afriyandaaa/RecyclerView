package com.example.rey.data
import com.example.rey.R
import com.example.rey.model.Rey

class Datasource {
    fun loadrey(): List<Rey> {
        return listOf<Rey>(
            Rey(R.string.affirmation1,  R.drawable.image1),
            Rey(R.string.affirmation2, R.drawable.image2),
            Rey(R.string.affirmation3, R.drawable.image3)
        )
    }
}