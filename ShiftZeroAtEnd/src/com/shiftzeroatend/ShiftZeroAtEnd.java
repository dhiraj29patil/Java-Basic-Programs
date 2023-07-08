package com.shiftzeroatend;

public class ShiftZeroAtEnd {
	public static void main(String[] args) {
		int[] arr = {1,5,0,3,0,4};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] == 0 && arr[j+1] != 0) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
