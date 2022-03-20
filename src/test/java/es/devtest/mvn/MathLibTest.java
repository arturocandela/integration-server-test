package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathLibTest {
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
    @DisplayName("Caso expecion, x menor de 0 e y mayor de 0")
    void testCalcularMediaXMenor0YMayor0(){

        float x = -5f;
        float y = 15f;



        assertThrows(ParameterUnderZeroException.class,
        ()-> MathLib.calcularMedia(x, y));

    }

    @Test
    @DisplayName("Caso expecion, x mayor de 0 e y menor de 0")
    void testCalcularMediaXMayor0YMenor0(){

        float x = 5f;
        float y = -15f;

        assertThrows(ParameterUnderZeroException.class,
        ()-> MathLib.calcularMedia(x, y));

    }


    

    
}
