package es.devtest.mvn;

public class MathLib {

    public MathLib(){

    }
    
    public static float calcularMedia( float x, float y) throws ParameterUnderZeroException{

        if ( x < 0 || y < 0 ){
            throw new ParameterUnderZeroException();
        }

        return ( x + y ) / 2 ;

    }

}
