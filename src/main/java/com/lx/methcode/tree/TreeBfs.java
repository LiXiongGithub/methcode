package com.lx.methcode.tree;

import java.util.*;

import com.alibaba.fastjson.JSON;
//DFS搜索
public class TreeBfs{
	public static void main(String[] args){
		/*
		构造树结构
				1
			2       3
		4	   5 6    7
						8
		*/
		TreeNode root = new TreeNode(1);
		TreeNode p1 = new TreeNode(2);
		TreeNode p2 = new TreeNode(3);
		TreeNode p3 = new TreeNode(4);
		TreeNode p4 = new TreeNode(5);
		TreeNode p5 = new TreeNode(6);
		TreeNode p6 = new TreeNode(7);
		TreeNode p7 = new TreeNode(8);
		root.left = p1;
		root.right = p2;
		p1.left = p3;
		p1.right = p4;
		p2.left = p5;
		p2.right = p6;
		p6.right = p7;
		
		//BFS广度搜索，定义队列，根节点放入队列，当队列不空，出队，判断该节点左右节点是否为空，不空入队
		System.out.println(JSON.toJSONString(getBfsResult (root)));
		
		//中序遍历
		ArrayList<Integer> result = new ArrayList<>();
		midQuery(root, result);
		System.out.println(JSON.toJSONString(result));
		
		//树的最大深度
		System.out.println(judgeMaxDeep(root));
		
	}
	
	
	/*
	 * 判断最大深度
	 * 定义函数，判断树最大深度，终结条件
	 * 节点为null，返回0;
	 * 不为null，判断左右子树的高度，加本父节点的高度。
	 * 递归调用
	 * 
	 */
	public static int judgeMaxDeep(TreeNode root){
		if(root == null){
			return 0;
		}
		return Math.max(judgeMaxDeep(root.left), judgeMaxDeep(root.right))+1;
	}
	
	//层序遍历
	public static ArrayList<ArrayList<Integer>> getBfsResult (TreeNode root){
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
		list.add(root);
		while(list.size() > 0){
			int size = list.size();
			ArrayList<Integer> eachList = new ArrayList<Integer>();
			for(int i = 0; i < size; i++){
				TreeNode node = list.poll();
				if(node.left != null){
					list.add(node.left);
				}
				if(node.right != null){
					list.add(node.right);
				}
				eachList.add(node.data);
				
			}
			resultList.add(eachList);
		}
		return resultList;
	}
	/*
	 * 中序遍历,定义函数，中序遍历树，先遍历左节点，后获取父节点，然后获取右节点
	 * 结束条件，该节点为null，返回。
	 * 递归
	 */

	public static void midQuery(TreeNode root,ArrayList<Integer> res){
		if(root == null){
			return ;
		}
		midQuery(root.left,res);
		res.add(root.data);
		midQuery(root.right,res);
	}
	
	
	//静态内部类，树节点定义
	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data){
			this.data = data;
		}
	}
}
