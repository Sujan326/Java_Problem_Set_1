//13.Find the Armstrong number
package com.practice;

import java.util.Scanner;

public class Question_13 {

	public static void armStrongNumber(int n) {

		int temp = n, sum = 0;
		while (temp > 0) {
			int rem = temp % 10;// Access last digit.
			sum = sum + (rem * rem * rem);// Cubing last digit and adding to the sum.
			temp = temp / 10;// Remove last digit.
		}
		if (n == sum) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not a ArmStrong Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter three digit number: ");
		int num = sc.nextInt();

		sc.close();

		armStrongNumber(num);

	}

}
