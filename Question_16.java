//16.Find the Nth Term of the Fibonacci Series

package com.practice;

import java.util.Scanner;

public class Question_16 {
	
	public static int nthFibonacciTerm(int n) {
		if(n == 0 || n == 1) {
			return n;
		} else {
			return nthFibonacciTerm(n-1) + nthFibonacciTerm(n-2);
		}
	}
	
	//Used for printing series
	public static int fibonacciAlgorithm(int n) {
		if(n <= 0) {
			return 0;
		}
		else if(n == 0) {
			return 1;
		}
		else if(n == 1) {
			return 2;
		}
		else {
			int a=0, b=1, temp = 0;
			for(int i=3; i<=n; i++) {
				temp = a + b;
				a = b;
				b = temp;
			}
			return temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of N to find the Nth Fibonacci term: ");		
		int num = sc.nextInt();
		
		sc.close();
		
		int result = nthFibonacciTerm(num);
		System.out.println("Nth Fibonacci term is: " + result);

	}

}
