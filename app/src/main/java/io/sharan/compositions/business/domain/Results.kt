package io.sharan.compositions.business.domain

import android.graphics.Picture

data class Results(
    val gender: String,
    val name: Name,
    val location: Location,
    val email: String,
    val dob: Dob,
    val phone: String,
    val cell: String,
    val id: Id,
    val picture: Picture,
    val nat: String
)