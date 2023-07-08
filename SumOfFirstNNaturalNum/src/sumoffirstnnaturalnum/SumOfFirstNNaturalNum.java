package sumoffirstnnaturalnum;

import java.util.Scanner;

public class SumOfFirstNNaturalNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last Number : ");
		int num = sc.nextInt();
		int sum = 0;
//		for(int i = 0; i <= num; i++) {
//			sum = sum + i;
//		}
//		System.out.println("Sum of First "+num+" Natural Number is : "+sum);
		sum = (num * (num + 1))/2; //According to mathematical Formula
		System.out.println("Sum of First "+num+" Natural Number is : "+sum);
		
	}
}
//Time Complexity of program using for loop is o(n).
//Time Complexity of program using mathematical Formula is o(1).