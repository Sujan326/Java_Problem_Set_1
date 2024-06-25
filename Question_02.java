//2.Check Whether a Number is Even or Odd in Java
package com.practice;

import java.util.Scanner;

public class Question_02 {

	public static void checkEvenOdd(int n) {

		if (n % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();

		checkEvenOdd(num);

	}

}
