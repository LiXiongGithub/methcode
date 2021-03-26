package com.lx.methcode.array;

public class A1 {

	/**
	 * 买卖股票的最佳时机
	 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
	 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
	 * @param args
	 */
	public static void main(String[] args){
		/*
		 * 思路：
		 * 计算后一天和前一天的价格差，如果是正数，则第一天买，第二天卖。如果是负数，则第一天不买，第二天不卖
		 */
		int[] a = {7,1,5,3,6,4};
		
		System.out.println(bestBenefit(a));
	}
	public static int bestBenefit(int[] a){
		/*
		 * 遍历整个数组，两个指针，l左指针，r右指针,计算差值
		 * 如果r-l大于0则计算收益，左右指针都右移一位
		 * 如果小于，不计算收益，左右指针右移一位
		 */
		int l = 0;
		int r = 1;
		int finalBenefit = 0;
		while(r < a.length){
			int benefit = a[r]-a[l];
			if(benefit > 0){
				finalBenefit = finalBenefit+benefit;
			}
			l++;
			r++;
		}
		return finalBenefit;
	}
}
