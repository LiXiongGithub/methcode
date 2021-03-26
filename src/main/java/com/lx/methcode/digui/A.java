package com.lx.methcode.digui;

public class A {
	/**
	 * 递归使用
	 * 1.终结条件，必须在递归调用体前面
	 * 2.递归调用体
	 * @param args
	 */
	
	public static void main(String[] args){
		System.out.println(fqlbsl(15));
		System.out.println(jiecheng(9));
		
	}
	/**
	 * 斐波拉切数列计算n的值
	 * [1，1，2，3，5，8，13……]
	 * f(1) = 1;(确定的值，即为终止条件)
	 * f(2) = 1;(确定的值，即为终止条件)
	 * f(3) = 2 = f(2)+f(1)
	 * f(4) = 3 = f(3)+f(2)
	 */
	public static int fqlbsl(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return fqlbsl(n-1)+fqlbsl(n-2);
	}
	/**
	 * 计算阶乘
	 * 0的阶乘 f(0) = 1;(确定的值，即为终止条件)
	 * 1的阶乘f(1) = 1*f(0);
	 * 2的阶乘f(2) = 2*f(1);
	 * 3的阶乘f(3) = 3*f(2);
	 * @param n
	 * @return
	 */
	public static int jiecheng(int n){
		if(n == 0){
			return 1;
		}
		return n*jiecheng(n-1);
	}
	
}
