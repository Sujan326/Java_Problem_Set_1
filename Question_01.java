//1.Check if a Number is Positive or Negative in Java

package com.practice;

import java.util.Scanner;

public class Question_01 {

	public static void checkNumber(int n) {

		if (n > 0) {
			System.out.println("The number is Positive");
		} else {
			System.out.println("The number is Negative");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		sc.close();

		checkNumber(number);

	}

}
