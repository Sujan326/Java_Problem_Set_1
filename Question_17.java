//17.Factorial of a number 

package com.practice;

import java.util.Scanner;

public class Question_17 {
	
	public static int calcFactorial(int fact) {
		if(fact == 0 || fact == 1) {
			return fact;
		}
		else {
			return fact * calcFactorial(fact - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for its factorial: ");
		int num = sc.nextInt();
		
		sc.close();
		
		int result = calcFactorial(num);
		System.out.format("The factorial of %d is: %d",num, result);

	}

}
