package com.minimumofarray;

public class MinimumOfArray {
	public static void main(String[] args) {
		int[] arr = {43,12,56,121,11,54};
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minumum From Array : "+min);
	}
}
