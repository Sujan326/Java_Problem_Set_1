//9.Find all the Prime Numbers in a Given Interval in Java

package com.practice;

import java.util.Scanner;

public class Question_09 {
	
	public static void primeInIntervals(int start, int end) {
		
		System.out.println("Prime Numbers from " + start + " to " + end );
		for(int num=start; num<=end; num++) {
			boolean isPrime = true;
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(num + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the start number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the end number: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		primeInIntervals(num1, num2);
		
	}

}
