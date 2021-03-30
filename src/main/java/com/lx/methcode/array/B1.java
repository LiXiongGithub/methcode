package com.lx.methcode.array;

import java.util.Map;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class B1 {
	/**
	 * 给定一数组和一目标值，在数组中找到两个元素的和为目标的下标
	 * @param args
	 */
	public static void main(String[] args){
		int[] a = {1,5,2,9,4,3};
		int target = 5;
		System.out.print(JSON.toJSONString(getTarget(a,target)));
	}
	public static int[] getTarget(int[] a,int target){
		/*
		 * 使用hashmap，遍历预算，如果target - 元素的值不存在于map，则存入key为该元素值，value为下标。
		 * 如果值存在map，则返回，当前预算下标，和map值的下标
		 */
		int[] result = new int[2];
		int i = 0;
		Map<Integer,Integer> tempMap = new HashMap();
		while(i < a.length){
			int temp = target-a[i];
			if(tempMap.get(temp) == null){
				tempMap.put(a[i], i);
			}else{
				result[0] = tempMap.get(temp);
				result[1] = i;
				break;
			}
			i++;
		}
		return result;
	}

}
