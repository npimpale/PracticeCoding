package com.synechron.aqr.nikhil;

public class LargestNumber {
	public static void main(String[] args) {

		int[] fred = { 60, 5, 7, 3, 20, 3, 44 };

		int[] tmp = new int[fred.length];
		go(fred, 1, tmp, 3);
	}

	public static void go(int[] fred, int cnt, int[] tmp, int whatPosition) {
		int max = 0;
		int currentPosition = 0;
		for (int i = 0; i < fred.length; i++) {
			if (i == 0)
				max = fred[i];
			else {
				if (fred[i] > max) {
					max = fred[i];
					currentPosition = i;
				}
			}
		}
		System.arraycopy(fred, 0, tmp, 0, fred.length);
		tmp[currentPosition] = 0;
		cnt++;
		if (cnt != whatPosition)
			go(tmp, cnt, tmp, whatPosition);
		else {
			for (int i = 0; i < tmp.length; i++) {
				if (i == 0)
					max = tmp[i];
				else {
					if (tmp[i] > max) {
						max = tmp[i];
					}
				}
			}
			System.out.println(max);
		}

	}
}
