package main

import main.kotlin.entities.Math
import main.kotlin.entities.User

fun main(args: Array<String>) {
    var user = User(firstName = "Matthew", lastName = "Setter")
    var m = Math()

    when  {
        user.getFullName().isNotEmpty() -> {
            println ("Hello ${user.getFullName()}")
        }
        else -> println ("Hello no name")
    }

    println ("The larger of 1 and 500 is ${m.max(1, 500)}")
}