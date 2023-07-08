package com.bubblesort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
	public static void main(String[] args) {
//		int[] arr = {7,6,5,4,3,2,1};
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(6);
		list.add(18);
		list.add(3);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list.get(4));
		list.set(2, 87);
		System.out.println(list);
		ArrayList lst = new ArrayList();
		lst.add(12);
		lst.add("Dhiraj");
		lst.add('P');
		System.out.println(lst);
	}
}
