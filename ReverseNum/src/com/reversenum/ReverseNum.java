package com.reversenum;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num;
		int rem = 0;
		int rev = 0;
		while(num != 0) {
			rem = num % 10;
			rev = rem + rev * 10;
			num /= 10;
		}
		System.out.println("Reverse Num of "+temp+" : "+rev);
	}
}
