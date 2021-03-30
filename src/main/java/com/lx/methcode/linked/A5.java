package com.lx.methcode.linked;

public class A5 {
	/**
	 * 环形链表
	 * 快指针每次走两步，慢指针每次走一步。如果有环，快指针总会指向慢指针指向的元素。
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode param1 = new ListNode(2);
		ListNode param2 = new ListNode(3);
		ListNode param3 = new ListNode(4);
		ListNode param4 = new ListNode(5);
		ListNode param5 = new ListNode(6);
		head.next = param1;
		param1.next = param2;
		param2.next = param3;
		param3.next = param4;
		param4.next = param5;
		param5.next = param2;
		System.out.println(check(head));
	}
	/**
	 * 如果有环，循环条件为fast.next = slow 或者快指针走到链表尾部了
	 * @param head
	 * @return
	 */
	public static boolean check(ListNode head){
		//慢指针
		ListNode sl = head;
		//快指针
		ListNode qu = head;
		while(qu != null && qu.next != null){
			qu = qu.next.next;
			sl = sl.next;
			if(sl == qu){
				return true;
			}
		}
		return false;
	}

}
