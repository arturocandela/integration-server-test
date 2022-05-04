package dam.proves;

public class MyCalculator {

     public int add( int a , int b ){

         if ( a < 0 || b < 0) {
             throw new IllegalArgumentException("Input arguments must be greater than 0");
         }

        return a + b;
    }

    public int sub( int a, int b){

        if ( a < 0 || b < 0) {
            throw new IllegalArgumentException("Input arguments must be greater than 0");
        }

        return a - b;
    }

    public int mult( int a, int b){

        if ( a < 0 || b < 0) {
            throw new IllegalArgumentException("Input arguments must be greater than 0");
        }

        return a * b;
    }

    public int div( int a, int b){

        if ( a < 0 || b < 0) {
            throw new IllegalArgumentException("Input arguments must be greater than 0");
        }

        return a / b;
    }



}
