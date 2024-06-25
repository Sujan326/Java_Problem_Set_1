//5.Find the Sum of the Numbers in a Given Interval in Java

package com.practice;

import java.util.Scanner;

public class Question_05 {

	public static void sumOfInterval(int start, int end) {
		int sum = 0;
		for (int num = start; num <= end; num++) {// Outer loop for range of numbers
			for (int i = num; i <= num; i++) {// Inner loop for accessing numbers from the range
				sum = sum + i; // Adding each number[i] to sum
			}
		}
		System.out.format("The sum of natural numbers ranging from %d to %d is %d ", start, end, sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the starting point: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the ending point: ");
		int num2 = sc.nextInt();

		sc.close();

		sumOfInterval(num1, num2);

	}

}
