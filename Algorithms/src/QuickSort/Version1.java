package QuickSort;

import Util.SortUtil;

/*
 * Quick Sort Algorithm
 */

public class Version1 {
	public static SortUtil sout = new SortUtil();

	public static void main(String[] args) {

		int[] arr = sout.createArray(1000000);

//		System.out.print("OriginArray : ");
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		long start = System.currentTimeMillis();

		quickSort(arr, 0, arr.length - 1);

		long end = System.currentTimeMillis();

		System.out.println("\nRunning Time : " + (end - start) / 1000.0 + "sec");

//		System.out.print("\nQuickSort : ");
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

	public static int partition(int[] arr, int left, int right) {
		int l = left;
		int r = right;
		int pivot = arr[(left + right) / 2];

//		System.out.print("\nbefore sort array - ");
//		for (int i = l; i <= r; i++) {
//			System.out.print(arr[i] + " ");
//		}
//
//		System.out.println("\npivot value : pivot - " + pivot);
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
//				System.out.println("\nswap value : left - " + arr[left] + " , right - " + arr[right]);
				sout.swap(arr, left, right);
				left++;
				right--;
//				for (int i = l; i <= r; i++) {
//					System.out.print(arr[i] + " ");
//				}
			}

		}
//		System.out.println("\nleft Index = " + left);
		return left;
	}

	public static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(arr, left, right);
			quickSort(arr, left, pivotIndex - 1);
			quickSort(arr, pivotIndex, right);
		}
	}
}
