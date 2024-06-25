//4.Find the Greatest of the Two Numbers in Java

package com.practice;

import java.util.Scanner;

public class Question_04 {

	public static void greatestNumber(int first, int second) {

		if (first > second) {
			System.out.println("Number " + first + " is greater than " + second);
		} else {
			System.out.println("Number " + second + " is greater than " + first);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		sc.close();

		greatestNumber(num1, num2);

	}

}
