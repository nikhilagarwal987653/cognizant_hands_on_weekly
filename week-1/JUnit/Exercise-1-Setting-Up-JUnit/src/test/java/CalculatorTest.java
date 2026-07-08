import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void addTest(){
        Calculator c=new Calculator();
        int result=c.add(3,5);
        assertEquals(8,result);
    }
}
