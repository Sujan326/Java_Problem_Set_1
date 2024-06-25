//3.Find the Sum of First N Natural Numbers in Java

package com.practice;

import java.util.Scanner;

public class Question_03 {

	public static void sumNumber(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of first " + n + " natural numbers is: " + sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of N: ");
		int num = sc.nextInt();
		
		sc.close();

		sumNumber(num);

	}

}
