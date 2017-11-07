package main.kotlin.entities

import main.kotlin.interfaces.Person

class User (var name: String = "") : Person
{
    override fun getName() : String {
        return name
    }
}