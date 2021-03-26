package com.lx.methcode.array;

import com.alibaba.fastjson.JSON;

public class A {
	/**
	 * 删除排序数组中的重复项
	 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
	 * @param args
	 */
	public static void main(String[] args){
		int[] a = {1,1,2,2,3,4,4,4,4,4,5,6,6,7};
		System.out.println(removeDuplicates(a));
	}
	
	public static int removeDuplicates(int[] nums) {
		// 两个指针，第一个指针befor，第二个after
		// 如果两个值相等，befor不动，ageter后移
		// 如果两个值不相等，begor+1赋值agter值，befor和after都后移一位
		int before = 0;
		int after = 1;
		while (after < nums.length) {
			if (nums[before] == nums[after]) {
				after++;
			} else {
				nums[before + 1] = nums[after];
				before++;
				after++;
			}
		}
		System.out.println(JSON.toJSONString(nums));
		return ++before;
	}

}
