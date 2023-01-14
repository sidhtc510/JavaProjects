import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testAdd(){
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testMultiply(){
        assertEquals(2+2*2, calc.multiply(2,3));
    }


    @Test
    public void primerTest(){
        assertEquals(6, calc.primer(2,2,2));
    }

    
}
