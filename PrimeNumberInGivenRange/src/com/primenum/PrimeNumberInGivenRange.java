package com.primenum;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberInGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int fno = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int sno = sc.nextInt();
		int counter;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = fno; i <= sno; i++) {
			counter = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					counter++;
				}
			}
			if(counter == 2) {
				list.add(i);
			}
		}
		System.out.println(list);
	}
}
