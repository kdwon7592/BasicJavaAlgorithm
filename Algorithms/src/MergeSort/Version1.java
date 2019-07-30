package MergeSort;

import Util.SortUtil;

/*
 * Merge Sort Algorithm Version 1
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

		mergeSort(arr, 0, arr.length - 1);

		long end = System.currentTimeMillis();

		System.out.println("\nRunning Time : " + (end - start) / 1000.0 + "sec");

//		System.out.print("\nMergeSort : ");
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (end + start) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int[] temp = new int[arr.length];

		int i = start;
		int j = mid + 1;
		int k = start;

		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		while (i <= mid)
			temp[k++] = arr[i++];
		
		while (j <= end)
			temp[k++] = arr[j++];

		for (int index = start; index < k; index++) {
			arr[index] = temp[index];
		}
	}
}
