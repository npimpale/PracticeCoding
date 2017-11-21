package com.synechron.aqr.nikhil;

import java.util.HashSet;
import java.util.Set;

public class PairFinder {
	private static int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, 0, -2, -3 };

	public static void main(String[] args) {
		// sort the array
		// find pairs.
		printArray(array);
		System.out.println(" ");
		sortArray(array);
		printArray(array);
		System.out.println(" ");
		Set<Pair> pairs = findPairs(array, 6);
		System.out.println("Pairs found : " + pairs.size());
		for (Pair p : pairs) {
			System.out.println(p.toString());
		}

	}

	public static void sortArray(int[] unsorted) {
		int temp = 0;
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = i + 1; j < unsorted.length; j++) {
				if (unsorted[i] > unsorted[j]) {
					temp = unsorted[i];
					unsorted[i] = unsorted[j];
					unsorted[j] = temp;
				}
			}
		}
	}

	public static void printArray(int[] toPrint) {
		for (int i : toPrint) {
			System.out.print(" " + i);
		}
	}

	public static Set<Pair> findPairs(int[] sortedArray, int sum) {
		Set<Pair> pairs = new HashSet<>();
		Pair pair = null;
		for (int i = 0, j = sortedArray.length - 1; i < j;) {
			if ((sortedArray[i] + sortedArray[j]) == sum) {
				pair = new Pair();
				pair.setX(sortedArray[i]);
				pair.setY(sortedArray[j]);
				pairs.add(pair);
				i++;
				j--;
			} else if ((sortedArray[i] + sortedArray[j]) < sum) {
				i++;
			} else if ((sortedArray[i] + sortedArray[j]) > sum) {
				j--;
			}
		}
		return pairs;
	}
}
