package es.devtest.mvn;

public class MathLib {

    private MathLib(){

    }
    
    public static float calcularMedia( float x, float y) throws ParameterUnderZeroException{

        if ( x < 0 || y < 0 ){
            throw new ParameterUnderZeroException();
        }

        return ( x + y ) / 2 ;

    }
    
    public static int majorDeTres(int a, int b, int c) {
    	
    	if ( a > b && a > c) {
    		
    		return a;
    	
    	} else  if ( c > b ){
    		
    		return c;
    		
    	} else {
    		
    		return b;
    		
    	}
    }
    
    public static double doOperation( double op1, double op2, String operation)  {
    	
    	double result = 0;
    	
    	switch (operation) {
    		
    	case "+":
    		result = op1 + op2;
    		break;
    	case "-":
    		result = op1 - op2;
    		break;
    	case "*":
    		result = op1 * op2;
    		break;
    	case "/":
    		result = op1 / op2;
    		break;
    	case "^":
    		result = (int) Math.pow(op1, op2);
    		break;
    	case "%":
    		result = op1 % op2;
    		break;
    	default:
			throw new UnsupportedOperationException();
    	}
    	
    	return result;
    	
    }
    
    public static double average(int[] numbers) {
    	double sum = 0.0;
    	
    	int i = 0;
    	
    	while ( i < numbers.length) {
    		sum += numbers[i];
    		i++;
    	}
    	
    	return sum/numbers.length;
    }
    
    public static int countVowels(String sentence) {
    	int totalVowels = 0;
    	
    	if (sentence != null) {
    		
    		sentence = sentence.toLowerCase();
    		
    		for (int i = 0; i<sentence.length();i++) {
    			if ( sentence.charAt(i) == 'a' || 
    					 sentence.charAt(i) == 'e' || 
    					 sentence.charAt(i) == 'i' || 
    					 sentence.charAt(i) == 'o' || 
    					 sentence.charAt(i) == 'u'  ) {
    				totalVowels++;
    			}
    		}
    	}
    	
    	return totalVowels;
    }
    
    

}
