
package appugochukwuemeka;

import java.util.*;
import java.io.*;


public class Appugochukwuemeka {

    public String getFizzBuzzValue(int number) {

        
		if (number % 5 == 0 && number % 3==0) 
                {
			return "FizzBuzz";
		}
                
                else if (number % 3 == 0) 
                {
			return "Fizz";
		}
                
                else if (number % 5 == 0)
                {
		    return "Buzz";
		}
                
                else if(number % 5 != 0 && number % 3!=0)
                {
                    return "not divisible";
                }
                

		return String.valueOf(number);
	}

    
    

        
    
  
    public static void main(String[] args) {
     
                Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");

		int number = input.nextInt();

		Appugochukwuemeka thisApp = new Appugochukwuemeka();
		String fizzBuzzValue = thisApp.getFizzBuzzValue(number);
		
		System.out.println("The Fizzbuzzvalue of " + number + " is " + fizzBuzzValue);
		
		

   
    
}
    
}