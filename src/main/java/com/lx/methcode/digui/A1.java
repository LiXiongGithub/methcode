package com.lx.methcode.digui;

/**
 * 一个青蛙上台阶，一次可以跳一步或者两步
 * n个台阶，求有多少种上法
 * @author lixiongxiong01
 *
 */
public class A1 {
	public static void main(String[] args){
		System.out.println(getStep(5));
	}
	/*
	 * 1.函数定义：n个台阶的上法
	 * 2.终止条件:n=1时，1种，n=2时,两种
	 * 3.等价关系式:只走一步，有两种
	 * 第一次跳了1个台阶，剩下的f(n-1)种
	 * 第一次跳了2个台阶，剩下的f(n-2)种
	 * 
	 */
	public static int getStep(int n){
		if(n == 1){
			return 1;
		}if(n == 2){
			return 2;
		}
		int step1 = getStep(n-1);
		int step2 = getStep(n-2);
		int result = step1 + step2;
		return result;
	}
}
