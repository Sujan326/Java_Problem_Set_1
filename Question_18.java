//18.Power of a number 

package com.practice;

import java.util.Scanner;

public class Question_18 {
	
	public static void calcPower(int base, int power) {
		
		int result = 1;
		for(int i=1; i<=power; i++) {
			result = result * base;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		int base = sc.nextInt();
		
		System.out.print("Enter the exponent number: ");
		int power = sc.nextInt();
		
		sc.close();	
		
		calcPower(base, power);
		

	}

}
