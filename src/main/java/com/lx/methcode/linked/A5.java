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
	
	/**
	 * 如果有环,环的入口确定
	 * 假设一个指针走了k步，入口为位置为a，环长为b，每次到入口节点都会有k = a+nb（先走 a 步到入口节点，之后每绕 1 圈环（ b 步）都会再次到入口节点）
	 * 则慢指针到入口节点的步数总是:a+nb步。
	 * 第一次相遇，满指针已经走了nb步，再走a步就是入口点
	 * 则这时只需要将快指针指向head，改为一步一步走，到第二次相遇就可以确定a的大小。
	 * 环的大小即为，第一次相遇的满指针步数。nb
	 * 
	 * @param head
	 * @return
	 */
	public static ListNode check2(ListNode head){
		//慢指针
		ListNode sl = head;
		//快指针
		ListNode qu = head;
		while(qu != null && qu.next != null){
			qu = qu.next.next;
			sl = sl.next;
			if(sl == qu){
				break;
			}
		}
		qu =  head;
		while(qu != sl){
			qu = qu.next;
			sl = sl.next;
		}
		return qu;
	}

}
