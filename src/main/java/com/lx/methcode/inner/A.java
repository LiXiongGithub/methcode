package com.lx.methcode.inner;

public class A {
	public static void main(String[] args){
		InnerNode a1 = new InnerNode(1);
		InnerNode a2 = new InnerNode(2);
		InnerNode a3 = new InnerNode(3);
		a1.next = a2;
		a2.next = a3;
		InnerNode p = a1;
		while(p != null){
			System.out.println(p.data);
			p = p.next;
		}
		
	}
	static class InnerNode{
		int data;
		InnerNode next;
		public InnerNode(int data){
			this.data = data;
			this.next = null;
		}
		public InnerNode(int data,InnerNode next){
			this.data = data;
			this.next = next;
		}
	}
}
