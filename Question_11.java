//11.Find the Reverse of a number
package com.practice;

import java.util.Scanner;

public class Question_11 {
	
	public static void reverseNumber(int n) {
		
		int rev = 0;
		while(n > 0) {
			rev = rev*10 + n%10;
			n = n/10;
		}
		System.out.println("Reversed Number: " + rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number without spaces: ");
		int num = sc.nextInt();
		
		sc.close();
		
		reverseNumber(num);
		
		

	}

}
