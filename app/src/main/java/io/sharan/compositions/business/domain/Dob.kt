package io.sharan.compositions.business.domain

data class Dob(
    val date: String,
    val age: Int
) {
    fun getAge() = "Age: $age"
}