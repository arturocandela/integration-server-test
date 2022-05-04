package dam.proves;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    @Test
    void add() {

        int expected = 4;
        MyCalculator myCalculator = new MyCalculator();
        assertEquals(expected,myCalculator.add(1,3));

    }

    @Test
    void divideByZero(){

        int numerador = 1;
        int denominador = 0;

        MyCalculator myCalculator = new MyCalculator();

        ArithmeticException e = assertThrowsExactly(ArithmeticException.class, ()->{
            myCalculator.div(numerador,denominador);
        });

        assertEquals("/ by zero",e.getMessage());

    }
}