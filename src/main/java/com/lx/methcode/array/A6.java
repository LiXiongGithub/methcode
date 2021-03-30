package com.lx.methcode.array;

import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

public class A6 {
	/**
	 * 给定两个数组，编写一个函数来计算它们的交集。
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,3,4,4,5};
		int[] b = {1,4,4,6};
		System.out.println(JSON.toJSONString(judge(a,b)));
	}
	
	public static int[] judge(int[] a,int[] b){
		/**
		 * 先排序，两个指针比较
		 * 如果相等，将该元素加入结果数组，并两个指针都后移，如果不等，将值较小的那个指针向后移动一位
		 * 继续比较
		 */
		List<Integer> result = new ArrayList<Integer>();
		Arrays.sort(a);
		Arrays.sort(b);
		
		int aIndex = 0;
		int bIndex = 0;
		while(aIndex < a.length && bIndex < b.length){
			if(a[aIndex] == b[bIndex]){
				result.add(a[aIndex]);
				aIndex++;
				bIndex++;
			}
			else if(a[aIndex] < b[bIndex]){
				aIndex++;
			}else{
				bIndex++;
			}
		}
		int[] arrayResult = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			arrayResult[i] = result.get(i);
		}
		return arrayResult;
	}
}
