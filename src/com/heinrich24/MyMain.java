package com.heinrich24;

import java.math.BigInteger;
import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		// Scanner input class
		Scanner sc = new Scanner(System.in);
		
		//Declare BigInteger variables to store values from the Scanner input.
		BigInteger firstValue = sc.nextBigInteger();
		BigInteger secondValue = sc.nextBigInteger();
		
		//Close the Scanner
		sc.close();
		
		// Perform logic for adding and multiplying values.
		// Note that you have to use method declaration instead of '+' and '*' operators as these variables are non-primitive values
		// and BigInteger is of type class.
		BigInteger addition = firstValue.add(secondValue);
		BigInteger multiply = firstValue.multiply(secondValue);
		
		// Print the results.
		System.out.println(addition);
		System.out.println(multiply);
	}

}
