package com.lx.methcode;

public class MidSearch {
	// 前提是必须有序
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 8, 9, };
		int b = 8;
		boolean flag = midSearch(a, b);
		System.out.println(flag);
	}

	public static boolean midSearch(int[] a, int b) {
		int low = 0;
		int high = a.length - 1;
		int middle = 0;
		// 防止越界判定
		if (b > a[high] || b < a[low] || low > high) {
			return false;
		}
		while (low <= high) {
			middle = (low + high) / 2;
			if (a[middle] == b) {
				return true;
			} else if (b < a[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return false;
	}

}
