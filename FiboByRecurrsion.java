package com.synechron.aqr.nikhil;

import java.util.ArrayList;
import java.util.List;

public class FiboByRecurrsion {
	List<Integer> fiboList = new ArrayList<>();

	public static void main(String[] args) {
		getFibo(20);
	}

	public static int fibo(int index) {
		if (index == 0) {
			return 0;
		}
		if (index == 1) {
			return 1;
		}
		return fibo(index - 1) + fibo(index - 2);
	}

	public static void getFibo(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" " + fibo(i));
		}
	}

}
