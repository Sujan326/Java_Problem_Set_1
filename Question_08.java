//8.Write a program to check if a given number is prime or not in java

package com.practice;

import java.util.Scanner;

public class Question_08 {

	public static void primeNumber(int n) {

		boolean isPrime = true;
		if (n <= 1) {
			System.out.println("Not Prime Number");
			return;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		sc.close();

		primeNumber(num);

	}

}
