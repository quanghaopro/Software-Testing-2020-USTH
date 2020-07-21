
import org.junit.Test;
import static org.junit.Assert.*;


public class CalcTest {
    @Test
    public void TestAdd() {
        assertEquals(40, calc.add(30, 10));
    }

    @Test
    public void TestSubtract() {
        assertEquals(5, calc.subtract(25, 5));
    }

    @Test
    public void TestMultiply() {
        assertEquals(120, calc.multiply(8, 15));
    }

    @Test
    public void TestDivide() {
        assertEquals(16, calc.divide(48, 3));
    }

    @Test (expected = ArithmeticException.class)
    public void TestDividedByZero() {
        calc.divide(5, 0);
    }
}