//14.Find all Armstrong number in a given range 

package com.practice;

import java.util.Scanner;

public class Question_14 {

	public static boolean isArmstong(int num) {

		// Number of Digits
		int temp = num;// Storing the original number in temp to perform calculation.
		int count = 0, rem;
		while (temp > 0) {
			rem = temp % 10;// Accessing last digit
			count++; // Increment the count of last digit
			temp /= 10;// Remove last digit
		}

		// Arm-Strong Logic
		temp = num;// Storing the original number in temp again to perform calculation.
		double sum = 0;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + Math.pow(rem, count);// Length of the digit is powered and added to the sum.
			temp /= 10;
		}

		// Checking isArmstrong
		if (sum == num) {
			return true;
		} else {
			return false;
		}

	}

	public static void armstrongGivenRange(int start, int end) {

		System.out.println("Armstrong Number from the range " + start + " to " + end);
		for (int i = start; i <= end; i++) {// Outer loop for the range
			if (isArmstong(i)) {// Accessing the numbers from the range
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the start number (from 100): ");
		int num1 = sc.nextInt();

		System.out.print("Enter the end number: ");
		int num2 = sc.nextInt();

		sc.close();

		armstrongGivenRange(num1, num2);

	}

}
