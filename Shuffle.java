package com.synechron.aqr.nikhil;

import java.util.Random;

public class Shuffle {
	private static int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {
		int i = 0, randomIndex = 0;
		Random random = new Random();
		while (i < array.length) {
			randomIndex = random.nextInt(array.length - 1);
			while (randomIndex == i) {
				randomIndex = random.nextInt(array.length - 1);
				// System.out.println("Same!!");
			}
			// swap
			int temp = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = temp;
			i++;
		}

		for (int j : array) {
			System.out.print(" " + j);
		}
	}

}
