package com.lx.methcode.array;

import com.alibaba.fastjson.JSON;

public class A2 {
	/**
	 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
	 * @param args
	 */
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8};
		System.out.println(JSON.toJSONString(moveK(a,5)));
	}
	public static int[] moveK(int[] a,int k){
		/*
		 * 临时数组
		 * 将a数组后k个元素，赋值给b数组的前k个元素
		 * 将a的剩余元素，赋值给b数组k开始的剩余元素
		 */
		int[] b = new int[a.length];
		// 将a数组后k个元素，赋值给b数组的前k个元素
		for (int i = 0; i < k; i++) {
			b[i] = a[a.length - k + i];
		}
		//将a的剩余元素，赋值给b数组k开始的剩余元素
		int start = 0;
		for(int j = k;j<b.length;j++){
			b[j] = a[start++];
		}
		return b;
	}
}
