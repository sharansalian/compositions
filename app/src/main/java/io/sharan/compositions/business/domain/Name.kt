package io.sharan.compositions.business.domain

data class Name(
    val title: String,
    val first: String,
    val last: String
) {
    fun getFullName() = "$title $first $last"
}