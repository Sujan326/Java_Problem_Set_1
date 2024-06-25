//19.Factor of a number

package com.practice;

import java.util.Scanner;

public class Question_19 {
	
	public static void factorsOfNumber(int num) {
		System.out.println("Factors of the number are: ");
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i  + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		factorsOfNumber(num);

	}

}
