package com.lx.methcode.linked;

import java.util.Stack;

public class A2 {
	public static void main(String[] args){
		//链表翻转
		ListNode head = new ListNode(1);
		ListNode param2 = new ListNode(2);
		ListNode param3 = new ListNode(3);
		ListNode param4 = new ListNode(4);
		ListNode param5 = new ListNode(5);
		ListNode param6 = new ListNode(6);
		head.next = param2;
		param2.next = param3;
		param3.next = param4;
		param4.next = param5;
		param5.next = param6;
		System.out.println("翻转前");
		A.getAllNode(head);
		System.out.println("翻转后");
		A.getAllNode(revers2(head));
		
		
	}
	/**
	 * 使用栈的特性，先进后出，后进先出
	 * 将链表元素一个一个入栈，直到为空
	 * 然后出栈，链接到最后，即为新的翻转栈
	 * @param head
	 * @return
	 */
	public static ListNode revers(ListNode head){
		if(head == null){
			return null;
		}
		ListNode p = head;
		Stack<ListNode> stack = new Stack<>();
		while(p!=null){
			stack.push(p);
			p = p.next;
		}
		//特殊处理头结点
		ListNode resultP = stack.pop();
		ListNode newHead = resultP;
		while(!stack.isEmpty()){
			ListNode node = stack.pop();
			resultP.next = node;
			resultP = resultP.next;
		}
		//特殊处理尾结点
		resultP.next = null;
		return newHead;
	}
	/**
	 * 双链表，第一个出的元素，next指向null
	 * 第二个出的元素，指向第一个元素
	 * 循环上述流程，直到链表遍历完
	 * @param head
	 * @return
	 */
	public static ListNode revers2(ListNode head){
		ListNode newHead = new ListNode();
		newHead = head;
		while(head != null){
			ListNode tempNode = head.next;
			tempNode.next = newHead;
			newHead = tempNode;
			head = tempNode;
		}
		return newHead;
	}
	
	
}
