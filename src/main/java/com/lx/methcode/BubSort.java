package com.lx.methcode;

import com.alibaba.fastjson.JSON;

public class BubSort {
	public static void main(String[] args){
		//冒泡排序
		int[] a = {1,0,5,3,2};
		bubSort(a);
		System.out.println(JSON.toJSONString(a));
		
	}
	public static void bubSort(int[] a){
		for(int i = 0; i< a.length-1; i++){
			for(int j = 0 ; j< a.length-1-i; j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
	}

}
