import org.example.SimpleCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringCalculatorTest {

    @Test
    public void testEmptyStringReturnsZero() {
        assertEquals(0, SimpleCalculator.add(""));
    }

    @Test
    public void testSingleNumberReturnsValue() {
        assertEquals(1, SimpleCalculator.add("1"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(6, SimpleCalculator.add("1,5"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(15, SimpleCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void testNewlineDelimiter() {
        assertEquals(6, SimpleCalculator.add("1\n2,3"));
    }

    @Test
    public void testCustomDelimiter() {
        assertEquals(3, SimpleCalculator.add("//;\n1;2"));
    }

    @Test
    public void testNegativeNumbersThrowException() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            SimpleCalculator.add("1,-2,-3");
        });
        assertEquals("negative numbers not allowed -2,-3", exception.getMessage());
    }


}
