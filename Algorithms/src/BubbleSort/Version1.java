package BubbleSort;

import Util.SortUtil;

/*
 * Bubble Sort Algorithm Version 1
 */

public class Version1 {

	public static SortUtil sout = new SortUtil();

	public static void main(String[] args) {

		int[] arr = sout.createArray(10000);

//		System.out.print("OriginArray : ");
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		long start = System.currentTimeMillis();

		bubbleSort(arr);

		long end = System.currentTimeMillis();

		System.out.println("\nRunning Time : " + (end - start) / 1000.0 + "sec");

//		System.out.print("\nBubbleSort : ");
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					sout.swap(arr, j, j + 1);
				}
			}
		}
	}
}
