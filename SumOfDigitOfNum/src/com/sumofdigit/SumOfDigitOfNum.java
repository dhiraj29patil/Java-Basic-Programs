package com.sumofdigit;

import java.util.Scanner;

public class SumOfDigitOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num != 0) {
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("Sum of "+temp+" : "+sum);
	}
}
