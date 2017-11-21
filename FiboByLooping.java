package com.synechron.aqr.nikhil;

import java.util.ArrayList;
import java.util.List;

public class FiboByLooping {

	public static void main(String[] args) {
		printFibo(fibo(20));
	}

	public static List<Integer> fibo(int n) {
		List<Integer> fibo = new ArrayList<>();
		int i = 0;
		while (fibo.size() < n) {
			if (i == 0) {
				fibo.add(0);
				i++;
				continue;
			}
			if (i == 1) {
				fibo.add(1);
				i++;
				continue;
			}

			fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
			i++;
		}
		return fibo;
	}

	public static void printFibo(List<Integer> list) {
		for (int i : list) {
			System.out.print(" " + i);
		}
	}
}
