//12.Find the Palindrome number

package com.practice;

import java.util.Scanner;

public class Question_12 {

	public static void palindromeNumber(int n) {

		int rev = 0;
		int originalNumber = n;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		if (rev == originalNumber) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();

		palindromeNumber(num);

	}

}
