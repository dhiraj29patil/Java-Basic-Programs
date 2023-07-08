package com.greatestofthreenum;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int fno = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int sno = sc.nextInt();
		System.out.println("Enter the Third Number : ");
		int tno = sc.nextInt();
		if(fno == sno && sno == tno && fno == tno) {
			System.out.println("All the Numbers are EQUAL");
		}
		else if(fno > sno && fno > tno) {
			System.out.println(fno+" is Greater");
		}
		else if(sno > tno) {
			System.out.println(sno+" is Greater");
		}
		else
			System.out.println(tno +" is Greater");
	}
}
