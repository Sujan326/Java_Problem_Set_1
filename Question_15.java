//15.Fibonacci Series upto nth term

package com.practice;

import java.util.Scanner;

public class Question_15 {
	
	public static int fibonacciSeries(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			return fibonacciSeries(n-1) + fibonacciSeries(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number of terms for the Fibonacci Series: ");
		int num = sc.nextInt();
		
		sc.close();
		
		fibonacciSeries(num);
		
		//Displaying Fibonacci Series
		System.out.println("Fibonacci Series up to: " + num);
		for(int i=0; i<=num; i++) {
			System.out.print(fibonacciSeries(i) + " ");
		}

	}

}


