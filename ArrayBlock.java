package com.synechron.aqr.nikhil;

public class ArrayBlock {
	private static int[][] array2D;

	public static void main(String[] args) {
		ArrayBlock ab = new ArrayBlock();
		ab.populateOriginalArray(6, 6);
		// ab.printOriginalArray();
		ab.printBlockArray();
	}

	public void printOriginalArray() {
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(" " + array2D[i][j]);
			}
			System.out.println(" ");
		}
	}

	public void populateOriginalArray(int rows, int columns) {
		array2D = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array2D[i][j] = j;
			}
		}
	}

	public void printBlockArray() {
		int innerBlockFactor = 0;
		int k = 0;
		for (int i = 0; i < array2D.length; i++) {
			innerBlockFactor = (int) getBlockFactor(array2D[i].length);
			for (int j = 0; j < innerBlockFactor * innerBlockFactor; j++) {
				if (k == innerBlockFactor) {
					System.out.println("");
					k = 0;
				}
				if (j < array2D[i].length) {
					System.out.print(" " + array2D[i][j]);
				} else {
					System.out.print(" X");
				}
				k++;
			}
			System.out.println(" ");
		}
	}

	public long getBlockFactor(int size) {
		long sqrt = Math.round(Math.sqrt(size));
		double sqr = Math.pow(sqrt, 2);
		return sqr >= size ? sqrt : sqrt + 1;
	}
}