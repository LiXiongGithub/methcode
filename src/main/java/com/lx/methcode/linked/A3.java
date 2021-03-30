package com.lx.methcode.linked;

/**
 * 合并两个有序链表
 * @author lixiongxiong01
 *
 */
public class A3 {
	/**
	 * [1,3,3,5]
	 * [2,4,6,7,8,9]
	 * 
	 * 双指针，比较大小，小的元素，加入新的链表，指针向后移，大的不动
	 * 结束条件，两个指针都指向最后
	 * @param args
	 */
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode param1 = new ListNode(3);
		ListNode param2 = new ListNode(3);
		ListNode param3 = new ListNode(5);
		head.next = param1;
		param1.next = param2;
		param2.next = param3;
		
		ListNode head2 = new ListNode(2);
		ListNode param11 = new ListNode(4);
		ListNode param22 = new ListNode(6);
		ListNode param33 = new ListNode(7);
		ListNode param44 = new ListNode(8);
		ListNode param55 = new ListNode(9);
		head2.next = param11;
		param11.next = param22;
		param22.next = param33;
		param33.next = param44;
		param44.next = param55;
		
		A.getAllNode(mergeList(head,head2));
	}
	public static ListNode mergeList(ListNode head,ListNode head2){
		ListNode u = head;
		ListNode d = head2;
		//新链表头的前一个，返回新链表头的next就是新链表头
		ListNode newPreHead = new ListNode();
		ListNode newP = newPreHead;
		if(u == null && d == null){
			return null;
		}
		while(u != null && d != null){
			if(u.date < d.date){
				newP.next = u;
				//指针后移
				u = u.next;
				newP = newP.next;
			}else{
				newP.next = d;
				//指针后移
				d = d.next;
				newP = newP.next;
			}
		}
		while(u == null && d != null){//到了u链表尾部。则将d链表的所有值存入
			newP.next = d;
			d = d.next;
			newP = newP.next;
		}
		while(d == null && u != null){//到了d链表尾部。则将u链表的所有值存入
			newP.next = u;
			u = u.next;
			newP = newP.next;
		}
		return newPreHead.next;
	}
}
