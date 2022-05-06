package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MathLibTest {
	
	private static final double DELTA = 1e-15;
	
    @Test
    @DisplayName("CalcularMedia - Caso general, x e y mayores de 0")
    void testCalcularMediaXMayor0YMayor0() {

        float x = 10f;
        float y = 15f;
        float expected = 12.5f;

        try{
            assertEquals(expected, MathLib.calcularMedia(x, y));
        } catch (ParameterUnderZeroException e){
            fail(e.getLocalizedMessage());
        }

    }

    @Test
    @DisplayName("CalcularMedia - Caso excepción, x menor de 0 e y mayor de 0")
    void testCalcularMediaXMenor0YMayor0(){

        float x = -5f;
        float y = 15f;



        assertThrows(ParameterUnderZeroException.class,
        ()-> MathLib.calcularMedia(x, y));

    }

    @Test
    @DisplayName("CalcularMedia - Caso excepción, x mayor de 0 e y menor de 0")
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
    
    @DisplayName("doOperation - Operaciones Exceptuando las que no existen/ denominador mayor que 0")
    @ParameterizedTest
    @CsvSource({"10,+,6,4",
    	        "2,-,6,4",
    	        "24,*,6,4",
    	        "1.5,/,6,4",
    	        "1296,^,6,4",
    	        "2,%,6,4"})
    void testDoOperation(double expected, String operation, double param1, double param2) {

    	assertEquals(expected,MathLib.doOperation(param1, param2, operation),DELTA);
    	
    }

    @DisplayName("doOperation - Operación que no existe")
    @ParameterizedTest
    @CsvSource({"10,SUM,6,4"})
    void testDoOperationThatDoesntExist(double expected, String operation, double param1, double param2) {

    	assertThrows(UnsupportedOperationException.class,
            ()->{
                MathLib.doOperation(param1, param2, operation);
            });
    	
    }

    @Test
    @DisplayName( "Average - Of a NULL int Array should rise NullPointerException" )
    void averageofNullIntArray(){
        assertThrowsExactly(NullPointerException.class,
         ()->{
            MathLib.average(null);
         });
    }

    @Test
    @DisplayName( "Average - Of an EMPTY int Array should return NaN" )
    void averageofEmptyIntArray(){

        double actual = MathLib.average(new int[0]);
        assertTrue(Double.isNaN(actual)); 
    }

    @Test
    @DisplayName( "Average - Of an Element int Array should return the element" )
    void averageofOneElementIntArray(){

        double expected = 1;
        double actual = MathLib.average(new int[]{(int)expected});
        assertEquals(expected, actual);; 
    }

    @ParameterizedTest(name = "CountWovels of ''{1}'' is ''{0}''")
    @DisplayName("CountVowels - Pruebas de Caja Blanca")
    @CsvSource(value = {"1,a",
                "1,f",
                "1,g",
                "1,h",
                "1,u",
                "0,k",
                "0,''",
                "0,null"},
                nullValues = {"null"})
    void countVowels(int expected, String sentence) {
        assertEquals(expected,MathLib.countVowels(sentence));
    }

}
