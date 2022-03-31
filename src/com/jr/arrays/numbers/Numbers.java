package com.jr.arrays.numbers;

import java.util.Scanner;

// Create a method that takes a number 10-99, and adds the two digits 
// together for example 74 = 7 + 4 = 11.

public class Numbers {

	private static Scanner myScanner = new Scanner(System.in);

	public Numbers() {

	}

	public void run() {
//		System.out.println("Enter a number between 10 and 99");
//		int myInput = myScanner.nextInt();
//		addNumbers(myInput);
		System.out.println("Enter a number between 1 and 99");
		int myInput2 = myScanner.nextInt();
		stringOfNumber(myInput2);

	}

	public void addNumbers(int num) {
		
		if (num >= 10 && num <= 99) {
		char[] arr = String.valueOf(num).toCharArray();
		System.out.println(Character.getNumericValue(arr[0]) + Character.getNumericValue(arr[1]));
		
		}

		else {
			System.out.println("Invalid entry: enter number between 10 - 99");
		}

	}
	
	public void stringOfNumber(int num) {
		
		if (num >= 1 && num <= 99) {
			
			String[] oneToNine = {"one","two","three","four","five","six","seven","eight","nine"};
			String[] elevenToNineteen = {"eleven", "twelve", "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			String[] tenToNinty = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
			
			
			// Check if single or double digit?
			char[] inputNumArr = String.valueOf(num).toCharArray();
			
			int lenghtOfInputNumArr = inputNumArr.length;
			
			if (lenghtOfInputNumArr == 1) {
				
//				System.out.println("You Have entered a Single Digit Number");
				
				int inputNumToInt0 = Character.getNumericValue(inputNumArr[0])%10;

				System.out.println(oneToNine[inputNumToInt0-1]);
				
			}
			
			else if (lenghtOfInputNumArr == 2) {
				
//				System.out.println("You have enetered a Two Digit NUmber");
				
				int inputNumToInt0 = Character.getNumericValue(inputNumArr[0])%10;
				int inputNumToInt1 = Character.getNumericValue(inputNumArr[1])%10;
				
				if (inputNumToInt1 == 0) {
					System.out.println(tenToNinty[inputNumToInt0-1]);
				}
				
				else if (inputNumToInt0 == 1){
					System.out.println(elevenToNineteen[inputNumToInt1-1]);
					
				}
				else {
					System.out.println(tenToNinty[inputNumToInt0-1]+"-"+oneToNine[inputNumToInt1-1]);
				}
					
				
				
//				System.out.println(twentyToNinty[inputNumToInt0]);
				
				
			}
			
		}
		
		else {
			System.out.println("Invalid entry: enter number between 1 - 99");
			}
	}

}
