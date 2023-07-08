package com.selectionsort;

public class SelectionSort {
	public static void SelectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min]) {
					int temp = arr[j];
					arr[j] = arr[min];
					arr[min] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4,2,5,1,7,3};
		System.out.print("Unsorted Array : [ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
		System.out.println(" ");
		System.out.print("Sorted Array : [ ");
		SelectionSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
}
