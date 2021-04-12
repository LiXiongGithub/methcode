package com.lx.methcode.tree;

import java.util.ArrayList;

import com.alibaba.fastjson.JSON;

public class A4 {
	public static void main(String[] args){
		/*
		 * 中序遍历，使用递归
		 * 定义函数
		 * 遍历节点,将结果放入res
		 * 结束条件：
		 * 	如果为null返回。
		 */
		TreeNode node = createTree();
		ArrayList<Integer> res = new ArrayList<>();
		midQueryTree(node, res);
		System.out.println(JSON.toJSONString(res));
		
	}
	public static void midQueryTree(TreeNode root,ArrayList res){
		if(root == null){
			return;	
		}
		midQueryTree(root.left, res);
		res.add(root.data);
		midQueryTree(root.right, res);
	}
	/**
	 *   3
	 *  9 20
	 *   15 7
	 * @return
	 */
	public static TreeNode createTree(){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		return root;
	}
}
