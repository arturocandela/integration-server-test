package dam.proves;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
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

    @ParameterizedTest
    @CsvSource({
        "-3,1",
        "3,-1"
    })
    void addWhenNegativeThrowsException(int a, int b)
    {
        assertThrowsExactly(IllegalArgumentException.class,()->{
            myCalculator.add(a,b);
        });
    }

    @Test
    void sub() {

        int expected = 3;
        assertEquals(expected,myCalculator.sub(5,2));

    }

    @ParameterizedTest
    @CsvSource({
        "-3,1",
        "3,-1"
    })
    void subWhenNegativeThrowsException(int a, int b)
    {
        assertThrowsExactly(IllegalArgumentException.class,()->{
            myCalculator.sub(a,b);
        });
    }


    @Test
    void mult() {

        int expected = 15;
        assertEquals(expected,myCalculator.mult(3,5));

    }

    @ParameterizedTest
    @CsvSource({
        "-3,1",
        "3,-1"
    })
    void mulWhenNegativeThrowsException(int a, int b)
    {
        assertThrowsExactly(IllegalArgumentException.class,()->{
            myCalculator.mult(a,b);
        });
    }

    @Test
    void div() {

        int expected = 5;
        assertEquals(expected,myCalculator.div(15,3));
    }

    @ParameterizedTest
    @CsvSource({
        "-3,1",
        "3,-1"
    })
    void divWhenNegativeThrowsException(int a, int b)
    {
        assertThrowsExactly(IllegalArgumentException.class,()->{
            myCalculator.div(a,b);
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