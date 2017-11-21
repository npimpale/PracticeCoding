package com.synechron.aqr.nikhil;

import static com.synechron.aqr.nikhil.ReverseArrayByTemp.printArray;

public class ReverseArraySinglePass {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		printArray(array);
		array = reverse(array);
		System.out.println("");
		printArray(array);
	}

	public static int[] reverse(int[] array) {
		int temp = 0;
		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			array[i] = array[i] + array[j];
			array[j] = array[i] - array[j];
			array[i] = array[i] - array[j];
			/*
			 * temp = array[i]; array[i] = array[j]; array[j] = temp;
			 */
		}
		return array;
	}

}
