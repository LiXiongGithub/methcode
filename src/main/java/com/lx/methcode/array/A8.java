package com.lx.methcode.array;

import com.alibaba.fastjson.JSON;

public class A8 {
	/**
	 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,2,0,4,0,5,8,9};
		System.out.println(JSON.toJSON(moveZero(a)));
		System.out.println(JSON.toJSON(moveZero2(a)));
	}
	/**
	 * 双指针
	 * 一个指针记录位置，一个指针交换,左指针遇到0，右指针将0和后面的数据两两交换。
	 * @param a
	 * @return
	 */
	public static int[] moveZero(int[] a){
		int le = 0;
		int ri = 0;
		int flag = 0;
		while(le < a.length-1-flag){
			if(a[le] != 0){
				le++;
			}else{
				flag++;
				ri = le;
				while(ri < a.length-1){
					int temp = a[ri];
					a[ri] = a[ri+1];
					a[ri+1] = temp;
					ri++;
				}
			}
		}
		return a;
	}
	/**
	 * 双指针
	 * 遍历数组第一个指针从0开始重新开始赋值，非0的元素，并且记录非零个数，第二次遍历将剩余的赋值为0
	 * 
	 * @return
	 */
	public static int[] moveZero2(int[] a){
		int le = 0;
		int ri = 0;
		int num = 0;
		
		while(ri < a.length){
			if(a[ri] != 0){
				a[le] = a[ri];
				le++;
				num++;
			}
			ri++;
		}
		for (int i = num; i < a.length; i++) {
			a[i] = 0;
		}
		return a;
	}
}
