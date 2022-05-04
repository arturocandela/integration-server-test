package dam.proves;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.nio.channels.MulticastChannel;

import static org.junit.jupiter.api.Assertions.*;


class MyCalculatorTest {

    MyCalculator myCalculator;

    @BeforeEach
    void setUpMyCalculator()
    {
        myCalculator = new MyCalculator();
        System.out.println("MyCalculator created");
    }

    @AfterEach
    void tearDownMyCalculator(){

        myCalculator = null;
        System.out.println("MyCalculator=null");

    }

    @Test
    void add() {

        int expected = 4;
        assertEquals(expected,myCalculator.add(1,3));

    }

    @Test
    void addWhenNegativeThrowsException()
    {
        assertThrowsExactly(IllegalArgumentException.class,()->{
            myCalculator.add(3,-1);
        });
    }

    @Test
    void sub() {

        int expected = 3;
        assertEquals(expected,myCalculator.sub(5,2));

    }

    @Test
    void subWhenNegativeThrowsException()
    {
        assertThrowsExactly(IllegalArgumentException.class,()->{
            myCalculator.sub(3,-1);
        });
    }


    @Test
    void mult() {

        int expected = 15;
        assertEquals(expected,myCalculator.mult(3,5));

    }

    @Test
    void mulWhenNegativeThrowsException()
    {
        assertThrowsExactly(IllegalArgumentException.class,()->{
            myCalculator.mult(3,-1);
        });
    }


    @Test
    void div() {

        int expected = 5;
        assertEquals(expected,myCalculator.div(15,3));
    }

    @Test
    void divWhenNegativeThrowsException()
    {
        assertThrowsExactly(IllegalArgumentException.class,()->{
            myCalculator.div(3,-1);
        });
    }


    @Test
    void divideByZero(){

        int numerador = 1;
        int denominador = 0;

        ArithmeticException e = assertThrowsExactly(ArithmeticException.class, ()->{
            myCalculator.div(numerador,denominador);
        });

        assertEquals("/ by zero",e.getMessage());

    }
}