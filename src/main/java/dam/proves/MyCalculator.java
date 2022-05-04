package dam.proves;

public class MyCalculator {

    private static final String INPUT_ARGUMENTS_MUST_BE_GREATER_THAN_0 = "Input arguments must be greater than 0";

    public int add( int a , int b ){

         if ( a < 0 || b < 0) {
             throw new IllegalArgumentException(INPUT_ARGUMENTS_MUST_BE_GREATER_THAN_0);
         }

        return a + b;
    }

    public int sub( int a, int b){

        if ( a < 0 || b < 0) {
            throw new IllegalArgumentException(INPUT_ARGUMENTS_MUST_BE_GREATER_THAN_0);
        }

        return a - b;
    }

    public int mult( int a, int b){

        if ( a < 0 || b < 0) {
            throw new IllegalArgumentException(INPUT_ARGUMENTS_MUST_BE_GREATER_THAN_0);
        }

        return a * b;
    }

    public int div( int a, int b){

        if ( a < 0 || b < 0) {
            throw new IllegalArgumentException(INPUT_ARGUMENTS_MUST_BE_GREATER_THAN_0);
        }

        return a / b;
    }



}
