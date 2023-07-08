package greatestoftwonum;

import java.util.Scanner;

public class GreatestOfTwoNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int fno = sc.nextInt();
		System.out.println("Enter the Secong Number : ");
		int sno = sc.nextInt();
		if(fno == sno) {
			System.out.println("Both the Numbers are EQUAL");
		}
		else if(fno > sno) {
			System.out.println(fno+" is Greater");
		}
		else
			System.out.println(sno+" is Greater");
	}
}
