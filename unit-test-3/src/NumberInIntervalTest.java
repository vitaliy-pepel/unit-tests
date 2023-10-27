import org.junit.Test;
import static org.junit.Assert.*;

public class NumberInIntervalTest {

    @Test
    public void testNumberInInterval() {
        NumberChecker numberChecker = new NumberChecker();

        assertTrue(numberChecker.numberInInterval(50));
        assertTrue(numberChecker.numberInInterval(75));
        assertFalse(numberChecker.numberInInterval(25));
        assertFalse(numberChecker.numberInInterval(100));
        assertFalse(numberChecker.numberInInterval(10));
        assertFalse(numberChecker.numberInInterval(200));
    }
}
