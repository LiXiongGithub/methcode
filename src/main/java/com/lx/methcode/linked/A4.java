package com.lx.methcode.linked;

import java.util.Stack;
public class A4 {
	//验证链表是否为回文链表
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode param1 = new ListNode(3);
		ListNode param2 = new ListNode(3);
		ListNode param3 = new ListNode(1);
		head.next = param1;
		param1.next = param2;
		param2.next = param3;
		System.out.println(checkList(head));
	}
	public static boolean checkList(ListNode head){
		/*
		 * 将元素全部放进stack中
		 * 遍历链表，将每个元素和栈中出的元素比较，先入后出的情况下，就相当于正反比较，如果相同则是回文的
		 */
		ListNode p = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(p != null){
			stack.push(p.date);
			p = p.next;
		}
		p = head;
		while(p != null){
			int a = p.date ;
			int b = stack.pop();
			if(a != b){
				return false;
			}
			p = p.next;
		}
		return true;
	}
}
