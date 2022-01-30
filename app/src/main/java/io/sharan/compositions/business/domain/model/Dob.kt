package io.sharan.compositions.business.domain.model

data class Dob(
    val date: String,
    val age: Int
) {
    fun getAge() = "Age: $age"
}