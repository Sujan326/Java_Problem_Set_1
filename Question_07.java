//7.Check Whether or Not the Year is a Leap Year in Java

package com.practice;

import java.util.Scanner;

public class Question_07 {

	public static void leapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = sc.nextInt();

		sc.close();

		leapYear(year);

	}

}
