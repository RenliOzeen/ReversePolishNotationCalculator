import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator rpnc;
    @BeforeEach
    public void setup() {
        rpnc = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        int result = rpnc.calculatePolishNotation("2 3 6  + +");
        Assertions.assertEquals(11, result);
    }

    @Test
    public void shouldCalculateSubstraction() {
        int result = rpnc.calculatePolishNotation("8 -1 2 - -");
        Assertions.assertEquals(11, result);
    }

    @Test
    public void shouldCalculateMultiplication() {
        int result = rpnc.calculatePolishNotation("5     4 *");
        Assertions.assertEquals(20, result);
    }
}


