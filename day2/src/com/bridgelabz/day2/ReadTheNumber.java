package com.bridgelabz.day2;

import java.util.Scanner;

public class ReadTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thousand = 0;
		int hundreds = 0;
		int tens = 0;
		int ones = 0;
		System.out.print("Enter 4 digit number: ");
		int number = sc.nextInt();
		if (number <= 9999 && number > 999) {
			thousand = number / 1000;
			System.out.printf("thousands place digit: " + thousand);
			hundreds = (number / 100) % 10;
			System.out.printf("\nHundreds place digit: " + hundreds);
			tens = (number / 10) % 10;
			System.out.printf("\nTens place digit: " + tens);
			ones = (number % 10);
			System.out.printf("\nOnes place digit: " + ones);
		} else {
			if (number > 9999)
				System.out.println("\nError! Number more then  digits.");
			if (number < 1000)
				System.out.println("Error! Number less then 4 digits.");
		}
	}
}