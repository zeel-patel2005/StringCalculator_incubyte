import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testEmptyStringReturnsZero() {
        assertEquals(0, calculator.add(""));
    }
}
