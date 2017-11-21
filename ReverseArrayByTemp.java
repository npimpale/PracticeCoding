package com.synechron.aqr.nikhil;

public class ReverseArrayByTemp {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		printArray(array);
		int[] temp = new int[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			temp[j] = array[i];
		}
		array = temp;
		System.out.println("");
		printArray(array);
	}

	public static void printArray(int[] temp) {
		for (int i = 0; i < temp.length; i++)
			System.out.print(" " + temp[i]);
	}
}
