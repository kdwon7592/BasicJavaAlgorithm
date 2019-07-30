package SelectionSort;

import Util.SortUtil;

/*
 * Selection Sort Algorithm Version 1
 */
public class Version1 {	
	static SortUtil sout = new SortUtil();

	public static void main(String[] args) {
		
		int[] arr = sout.createArray(100000); 
		
//		System.out.print("OriginArray : ");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		long start = System.currentTimeMillis();

		minSelectionSort(arr);
		
		long end = System.currentTimeMillis();
		
		System.out.println( "\nRunning Time : " + ( end - start )/1000.0 + "sec");
		
//		System.out.print("\nMinSelectionSort : ");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		start = System.currentTimeMillis();
		
		maxSelectionSort(arr);
		
		end = System.currentTimeMillis();
		
		System.out.println( "\nRunning Time : " + ( end - start )/1000.0 + "sec");
		
//		System.out.print("\nMaxSelectionSort : ");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
	}
	
	public static void minSelectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			int minVal = arr[i];
			int position = i;
			
			for(int j = arr.length - 1 ; j >= i; j--) {
				
				if(minVal > arr[j]) {
					minVal = arr[j];
					position = j;
				}
				
			}
			sout.swap(arr, position, i);
		}
	}
	
	public static void maxSelectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			int maxVal = arr[i];
			int position = i;
			
			for(int j = arr.length - 1 ; j >= i; j--) {
				
				if(maxVal < arr[j]) {
					maxVal = arr[j];
					position = j;
				}
				
			}
			sout.swap(arr, position, i);
		}
	}
}
