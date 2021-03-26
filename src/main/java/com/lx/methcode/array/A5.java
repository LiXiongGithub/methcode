package com.lx.methcode.array;

public class A5 {
	/**
	 * 检测只出现一次的数字
	 * @param args
	 */
	public static void main(String[] args){
		int[] a = {1,2,3,2,1};
		System.out.println(judgeOnly(a));
	}
	/**
	 * 按位异或：每一位不同的结果是1，相同的是0
	 * 0和任何数异或是数字本身，数字本身与自己异或是0
	 * @param a
	 * @return
	 */
	public static int judgeOnly(int[] a){
		int result = 0;
		for(int i = 0; i < a.length; i++){
			result = result^a[i];
		}
		return result;
	}
}
