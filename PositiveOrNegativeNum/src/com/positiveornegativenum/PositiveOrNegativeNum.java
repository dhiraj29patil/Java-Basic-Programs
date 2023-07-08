package com.positiveornegativenum;

import java.util.Scanner;

public class PositiveOrNegativeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println(num+" is Nor Positive Nor Negative");
		}
		else if(num > 0) {
			System.out.println(num +" is a Positive Number");
		}
		else
			System.out.println(num+" is a Negative Number");
	}

}
