package Util;

import java.util.Random;

public class SortUtil {

	Random random = new Random();

	public int[] createArray() {
		int size = random.nextInt(10000);
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(size);
		}

		return arr;
	}
	
	public int[] createArray(int size) {
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(size);
		}

		return arr;
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
