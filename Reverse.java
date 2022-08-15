package com.bridgelabz;

public class Reverse {
	 public static void main(String[] args) {

		    int num = 1234, reversed = 0;
		    
		    System.out.println("Original Number: " + num);

		    // run loop until number becomes 0
		    while(num != 0) {
		    
		      // get last digit from number
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from number
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
		  }
		

}
