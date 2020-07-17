import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalcTest {

    private static Calc calc;

    @BeforeAll
    public static void init(){
        calc = new Calc();
    }

    @Test
    public void whenCalcInitializedThenReturnTrue() {
        assertTrue(calc.getStatus());
    }

    @Test
    public void whenAddTwoNumberThenReturnCorrectAnswer() {
        assertEquals( 5, calc.add(2,3));
    }

    @Test
    public void whenSubThenReturnCorrectAnswer() {
        assertEquals( 3, calc.sub(7, 4));
    }

    @Test
    public void whenDivThenReturnCorrectAnswer() {
        assertEquals(2, calc.div(8, 4));
    }

    @Test
    public void whenDivByZeroThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.div(5, 0);
        });
        assertEquals("Cannot division by zero", exception.getMessage());
    }
}