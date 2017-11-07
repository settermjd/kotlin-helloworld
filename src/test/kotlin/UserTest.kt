package test.kotlin

import main.kotlin.entities.User
import org.junit.Test
import kotlin.test.assertEquals

class UserTest {
    @Test fun testCanSetAndRetrieveNameProperty() : Unit {
        var u = User(name = "Matthew")
        assertEquals("Matthew", u.name)
    }
}