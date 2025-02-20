import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun `test addition`() {
        assertEquals(5.0, calculator.add(2.0, 3.0))
    }

    @Test
    fun `test subtraction`() {
        assertEquals(1.0, calculator.subtract(4.0, 3.0))
    }

    @Test
    fun `test multiplication`() {
        assertEquals(12.0, calculator.multiply(4.0, 3.0))
    }

    @Test
    fun `test division`() {
        assertEquals(2.0, calculator.divide(6.0, 3.0))
    }

    @Test
    fun `test division by zero`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(5.0, 0.0)
        }
        assertEquals("Cannot divide by zero", exception.message)
    }
}
