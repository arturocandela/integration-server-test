package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MathLibTest {
	
	private static final double DELTA = 1e-15;
	
    @Test
    @DisplayName("Caso general, x e y mayores de 0")
    void testCalcularMediaXMayor0YMayor0() {

        float x = 10f;
        float y = 15f;

        try{
            assertEquals((x+y)/2, MathLib.calcularMedia(x, y));
        } catch (ParameterUnderZeroException e){
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("Caso excepció, x menor de 0 e y mayor de 0")
    void testCalcularMediaXMenor0YMayor0(){

        float x = -5f;
        float y = 15f;



        assertThrows(ParameterUnderZeroException.class,
        ()-> MathLib.calcularMedia(x, y));

    }

    @Test
    @DisplayName("Caso excepció, x mayor de 0 e y menor de 0")
    void testCalcularMediaXMayor0YMenor0(){

        float x = 5f;
        float y = -15f;

        assertThrows(ParameterUnderZeroException.class,
        ()-> MathLib.calcularMedia(x, y));

    }
    
    @ParameterizedTest
    @CsvSource({"2,2,1,0",
    			"3,2,3,1",
    			"4,2,3,4",
    			"4,3,2,4"})               
    void testMajorDe3(int expected, int a, int b, int c) {
    	assertEquals(expected, MathLib.majorDeTres(a, b, c));
    }
    
    @ParameterizedTest
    @CsvSource({"10,+,6,4",
    	        "2,-,6,4",
    	        "24,*,6,4",
    	        "1.5,/,6,4",
    	        "1296,^,6,4",
    	        "2,%,6,4",
    	        "0,SUM,6,4"})
    void testDoOperation(double expected, String operation, double param1, double param2) {
    	assertEquals(expected,MathLib.doOperation(param1, param2, operation),DELTA);
    	
    }
    
}
