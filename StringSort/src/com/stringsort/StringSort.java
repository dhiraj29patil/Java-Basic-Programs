package com.stringsort;

import java.util.Arrays;

public class StringSort {
	public static void main(String[] args) {
		String[] arr = {"Papaya","Lime","Watermelon","Apple","Mango", "Kiwi"};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}	
