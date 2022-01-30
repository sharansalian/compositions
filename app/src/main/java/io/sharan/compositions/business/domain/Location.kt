package io.sharan.compositions.business.domain

data class Location(
    val street: Street,
    val city: String,
    val state: String,
    val country: String,
    val postcode: String,
) {
    fun getFullAddress() = "${street.name} ${street.number} $city $state $postcode"
}