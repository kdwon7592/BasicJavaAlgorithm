package InsertionSort;

import Util.SortUtil;

/*
 * Insertion Sort Algorithm Version 1
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
		
		insertionSort(arr);

		long end = System.currentTimeMillis();
		
		System.out.println( "\nRunning Time : " + ( end - start )/1000.0 + "sec");
		
//		System.out.print("\nInsertionSort : ");
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int comp = i - 1;
			int val = arr[i];
			while (comp >= 0 && val < arr[comp]) {
				sout.swap(arr, comp, comp+1);
				comp--;
			}
		}
	}
}
