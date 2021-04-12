package com.lx.methcode.array;

import com.alibaba.fastjson.JSON;

/**
 * 合并两个有序数组
 * @author lixiongxiong01
 *1.a,b两个数组
 *直接将b放入a后，整体排序
 *2.申请临时变量，两个指针分别指向a和b，小的放入新数组，后移一位
 *3.不申请临时变量，从后往前比较，大的数值放入租后面。不会产生覆盖情况。
 */
public class A9 {
	public static void main(String[] args){
		int[] a = {1,3,4,6,7,8,9};
		int[] b = {2,4,5,7,10};
		System.out.println(JSON.toJSONString(sort(a,b)));
	}
	public static int[] sort(int[] a,int[] b){
		int[] temp = new int[a.length+b.length];
		int ap = 0;
		int bp = 0;
		int i = 0;
		while(ap < a.length && bp<b.length){
			if(a[ap]<b[bp]){
				temp[i] = a[ap];
				ap++;
			}else{
				temp[i] = b[bp];
				bp++;
			}
			i++;
		}
		if(ap == a.length){//a比较到了尾部，将b的剩余放入结尾
			for (int j = bp; j < b.length; j++) {
				temp[i] = b[bp];
				i++;
				bp++;
			}
		}
		if(bp == b.length){//a比较到了尾部，将b的剩余放入结尾
			for (int j = ap; j < a.length; j++) {
				temp[i] = a[ap];
				i++;
				ap++;
			}
		}
		return temp;
	}
}
