package com;

import java.util.Scanner;

public class AliquotSum {

	// Method to get the Aliquot Divisors Sum
	public int getAliquotDivisorsSum(int userInputValue) {
		int i;
		int divisorsSum = 0;

		for (i = 1; i < userInputValue; i++) {	//	Looping through until user entered value
			if (userInputValue % i == 0) {	//	If the user input value mod looping value is equal to zero then it is a divisor of the number
				divisorsSum = divisorsSum + i;	//	Adding up the divisor
			}
		}
		return divisorsSum;	//	Returning the Sum
	}

	//	Checking the user input value is equal to divisor sum if so it is the perfect number
	public void perfectNumberCheck(int userInputValue, int divisorsSum) {
		if (userInputValue == divisorsSum) {	//	Checking the equality to declare the number as perfect number
			System.out.println("The given number " + userInputValue + " is a PERFECT number");
		} else {
			System.out.println("The given number " + userInputValue + " is not a PERFECT number");
		}
	}

	//	Main method
	public static void main(String[] args) {
		int userInputValue;
		int divisorsSum;

		AliquotSum as = new AliquotSum();	//	Class object to use the defined methods
		Scanner in = new Scanner(System.in);	//	Scanner to get the user input values

		System.out.print("Enter a number to get Aliquot Sum : ");
		userInputValue = in.nextInt();

		divisorsSum = as.getAliquotDivisorsSum(userInputValue);	//	Calling the getAliquotDivisorsSum method Aliquot Divisors Sum

		System.out.println("The aliquot sum of the given number " + userInputValue + " is : " + divisorsSum);

		as.perfectNumberCheck(userInputValue, divisorsSum);	//	Calling the perfectNumberCheck method to check the entered number is perfect or not

		in.close();

		System.out.println("---------------------------------------------------------------------");
		System.out.println("The perfect numbers between 1 to 100 are:");	
		for (int i = 1; i <= 100; i++) {	//	Loop to print the perfect numbers between 1 to 100
			divisorsSum = as.getAliquotDivisorsSum(i);
			if (i == divisorsSum) {
				System.out.println(i);
			}
		}
	}
}