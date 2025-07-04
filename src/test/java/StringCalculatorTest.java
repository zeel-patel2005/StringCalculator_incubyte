import org.example.SimpleCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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


}
