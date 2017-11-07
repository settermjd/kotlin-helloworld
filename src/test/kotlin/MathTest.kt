import main.kotlin.entities.Math
import org.junit.Test
import kotlin.test.assertEquals

class MathTest {
    @Test
    fun testCanFindLargerOfTwoNumbers() : Unit {
        var m = Math()
        assertEquals(45, m.max(a = 1, b = 45))
    }
}