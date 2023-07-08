package com.maxofarray;

public class MaxOfArray {
	public static void main(String[] args) {
		int[] arr = {43,12,56,121,11,54};
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum From Array : "+max);
	}
}
