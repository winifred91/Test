package test;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by winifred on 2017.03.06..
 */
public class CalcTest extends TestCase {
    protected double number1;
    protected double number2;

    Calc calc = new Calc();

    protected void setUp() {
        number1 = 5;
        number2 = 7;
    }

    @Test
    public void testSum() throws Exception {

        double result = calc.sum(number1, number2);
        assertEquals(12, result, 0);
    }

    @Test
    public void testSub() throws Exception {

        double result = calc.sub(number1, number2);
        assertEquals(-2, result, 0);
    }

    @Test
    public void testMult() throws Exception {
        double result = calc.mult(number1, number2);
        assertEquals(35, result, 0);
    }

    @Test
    public void testDiv() throws Exception {
        double result = calc.div(number1, number2);
        assertEquals(0.71, result, 0.72);
    }

}