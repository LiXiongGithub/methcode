package com.lx.methcode.linked;

public class A1 {
	/**
	 * 链表删除倒数第n个节点
	 * @param args
	 */
	public static void main(String[] args){
		/*
		 * 双指针，左指针和右指针，右指针先走n步
		 * 然后左指针和右指针共同向后移动，当右指针到了末尾，左指针就正好是倒数第n个元素
		 */
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
		A.getAllNode(head);
		System.out.println("移除后");
		A.getAllNode(remove(head,6));
		
	}
	/**
	 * 不获取长度，双指针移动，右指针先移动n步
	 * 左指针为null，说明移动到了结尾，反过来即需要删除的是头指针
	 * 左指针和右指针同时移动到最后节点
	 * @param head
	 * @param n
	 * @return
	 */
	public static ListNode remove(ListNode head,int n){
		ListNode le = head;
		ListNode ri = head;
		//右边指针先移动n步
		for(int i=0; i<n ;i++){
			ri = ri.next;
		}
		//正向移动n步后一个为空，说明要删除头指针。直接返回头指针的下一个指针即可
		if(ri == null){
			return le.next;
		}
		//左指针和右指针同时移动到末尾
		while(ri.next != null){
			le = le.next;
			ri = ri.next;
		}
		//此时移动到了n-1位置，将该指针指向后面第二个节点
		le.next = le.next.next;
		return head;
	}
	
	/**
	 * 获取长度，移动到length-n的位置，赋值的方法
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
        //找到链表的长度
        int length = getLength(head);
        if (head.next == null || length - n <= 0)
            return head.next;
        //双指针定位到第n个节点，将左指针指向右指针的下一个节点
        ListNode le = head;
        int i = 0;
        while(i<length-n-1){
            i++;
            le = le.next;
        }
        le.next = le.next.next;
        return head;
        
    }
    public static int getLength(ListNode head){
        int i = 1;
        while(head.next!=null){
            i++;
            head = head.next;
        }
        return i;
    }
}
