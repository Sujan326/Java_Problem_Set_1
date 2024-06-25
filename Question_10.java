//10.Find the Sum of the Digits of a Number in Java Language

package com.practice;

import java.util.Scanner;

public class Question_10 {

	public static void sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;// Access last digit
			sum = sum + rem; //Add last digit to sum
			n = n / 10; //Remove last digit
		}
		System.out.println("Sum of digits: " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the digits: ");
		int digits = sc.nextInt();

		sc.close();

		sumOfDigits(digits);

	}

}
