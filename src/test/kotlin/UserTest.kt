package test.kotlin

import main.kotlin.entities.User
import org.junit.Test
import kotlin.test.assertEquals

class UserTest {
    @Test fun testCanSetAndRetrieveNameProperty() : Unit {
        var u = User(firstName = "Matthew", lastName = "Setter")
        assertEquals("Matthew", u.firstName)
    }
}