import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EvenOddNumberTest {

    private int number;
    private boolean expected;

    public EvenOddNumberTest(int number, boolean expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {4, true},
                {7, false},
                {-5, false},
                {0, true},
                {100, true},
                {-10, true}
        });
    }

    @Test
    public void testEvenOddNumber() {
        EvenOdd myClass = new EvenOdd();
        assertEquals(expected, myClass.evenOddNumber(number));
    }
}

