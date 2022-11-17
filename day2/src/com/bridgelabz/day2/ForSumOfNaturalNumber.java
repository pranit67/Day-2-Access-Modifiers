package com.bridgelabz.day2;

public class ForSumOfNaturalNumber {
	public static void main(String[] args) {
		int N = 7;
		System.out.print("First " + N + " Numbers = ");
		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Sum of first " + N + " Natural Number = " + (N * (N + 1)) / 2);
	}
}