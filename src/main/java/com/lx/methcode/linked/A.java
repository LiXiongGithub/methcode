package com.lx.methcode.linked;

public class A {

	public static void main(String[] args){
		/*
		 *创建一个链表 
		 */
		ListNode head = new ListNode(1);
		ListNode param1 = new ListNode(2);
		ListNode param2 = new ListNode(3);
		ListNode param3 = new ListNode(4);
		head.next = param1;
		param1.next = param2;
		param2.next = param3;
		getAllNode(head);
		removeTarget(param2);
		getAllNode(head);
		
	}

	private static void removeTarget(ListNode target) {
		target.date = target.next.date;
		target.next = target.next.next;
	}
	
	public static void getAllNode(ListNode node){
		System.out.println("开始遍历链表:");
		while(node != null){
			System.out.println(node.date);
			node = node.next;
		}
	}
	
	
	
	
	
	
	
	
	
}
