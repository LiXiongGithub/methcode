package com.lx.methcode.array;

import com.alibaba.fastjson.JSON;

public class A7 {
	/**
	 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
	 * 
	 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
	 * 
	 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {1,9,9};
		int a1[] = {9,9,9};
		int a2[] = {2};
		System.out.println(JSON.toJSONString(getResult(a2)));
	}
	public static int[] getResult(int[] a){
		/*
		 * 最后一位加一，如果等于10，前一位加一
		 * 循环至数组的第一位，如果还是大于10，则单独增加一位
		 * 否则加一后返回,跳出循环
		 * 最后判断数组第一位是否为0，如果为0，则需要单独处理，新建数组，第一位赋值1
		 */
		int index = a.length-1;
		while(index >= 0){
			if(a[index]+1 == 10){
				a[index]=0;
				index -- ;
			}else{
				a[index] = a[index]+1;
				break;
			}
		}
		if(a[0] == 0){
			int[] b = new int[a.length+1];
			b[0] = 1;
			for (int i = 0; i < a.length; i++) {
				b[i+1] = a[i];
			}
			return b;
		}else{
			return a;
		}
	}
}
