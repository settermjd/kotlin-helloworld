package main.kotlin.entities

import main.kotlin.interfaces.Person

class User(override var firstName: String = "", override var lastName: String = "") : Person {
    override fun getFullName(): String {
        return "$firstName $lastName"
    }
}