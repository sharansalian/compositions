package io.sharan.compositions.business.domain.model

data class Base(val results: List<Results>) {
    fun getPersons(): ArrayList<Person> {
        val persons = ArrayList<Person>()
        results.forEach {
            persons.add(
                Person(
                    id = 0,
                    img = it.picture.large,
                    name = it.name.getFullName(),
                    dob = it.dob.getAge(),
                    address = it.location.getFullAddress(),
                    phone = it.cell
                )
            )
        }
        return persons
    }

}