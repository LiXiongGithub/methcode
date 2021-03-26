package com.lx.methcode.array;

import java.util.HashSet;
import java.util.Set;

public class A4 {
	/**
	 * 给定一个整数数组，判断是否存在重复元素。
	 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
	 * @param args
	 */
	public static void main(String[] args){
		int[] a = {1,2,2,3,4,8,5,4,6};
		int[] a1 = {1,2,3,4,5};
		System.out.println(judgeRepeat(a));
	}
	
	//set法
	public static boolean judgeRepeat(int[] a){
		/**
		 * 放入set，如果存在，则返回true
		 */
		Set<Integer> s = new HashSet<>();
		for(int i = 0; i<a.length; i++){
			if(s.contains(a[i])){
				return true;
			}else{
				s.add(a[i]);
			}
		}
		return false;
	}
	//第二种方法，先排序，后相邻的比较
}
