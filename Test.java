package com.synechron.aqr.nikhil;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getArraySum(new int[] { 1, 3, 2 }));
	}

	public static int solution(int[] A) {
		Set<Integer> set = new TreeSet<>();
		int max = 0;
		int spi = 0;
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
			if (A[i] > max) {
				max = A[i];
			}
			if (set.contains(max - 1)) {
				spi = max + 1;
				max = max + 1;
			}
			if (set.contains(max + 1)) {
				spi = max + 2;
			}
		}
		return spi;
	}

	public static int getArraySum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}
