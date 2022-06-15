/*
 * Copyright 2022 Conselleria d'Educació Cultura i Esport
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
