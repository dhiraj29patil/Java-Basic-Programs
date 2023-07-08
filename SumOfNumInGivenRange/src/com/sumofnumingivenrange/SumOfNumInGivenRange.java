package com.sumofnumingivenrange;

import java.util.Scanner;

public class SumOfNumInGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Number : ");
		int sno = sc.nextInt();
		System.out.println("Enter the Ending Number : ");
		int eno = sc.nextInt();
		int sum = 0;
		for(int i = sno; i <= eno; i++) {
			sum = sum + i;
		}
		System.out.println("Sum from "+sno+" to "+eno+" : "+sum);
	}
}
