package com.synechron.aqr.nikhil;

public class SortString {
	private static String str = "NikhilPimpale9760";

	public static void main(String[] args) {
		char[] strArray = str.toCharArray();
		int c1 = 0, c2 = 0, temp = 0;
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				c1 = strArray[i];
				c2 = strArray[j];
				if (c1 > c2) {
					temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = (char) temp;
				}
			}
		}
		for (char c : strArray)
			System.out.print(c);
	}

}
