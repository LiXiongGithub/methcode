package com.lx.methcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import com.alibaba.fastjson.JSON;

/**
 * BFS和DFS
 * 层序遍历和前后序遍历二叉树
 * 放入根节点
 * while根节点不为空
 * ---------while---------
 * BFS:队列poll，poll出的即为当前遍历元素。
 * DFS:放入栈，栈pop出的即为当前遍历元素。
 * 判断
 * 	left节点，不为空继续放入队列或者栈
 * 	right节点，不为空继续放入队列或者栈
 * -----------------------
 * reutnr ;
 * @author lixiongxiong01
 *
 */
public class A2 {
	public static void main(String[] args){
		
		/**
		 *   3
		 *  9 20
		 *   15 7
		 * @return
		 */
		TreeNode root = A1.createTree();
		System.out.println("bfs开始");
		bfsTree(root);
		System.out.println("bfs开始,需要返回值");
		System.out.println(JSON.toJSONString(bfsTreeList(root)));
		System.out.println("dfs右序遍历开始");
		dfsTreeRight(root);
		System.out.println("dfs左序遍历开始");
		dfsTreeLeft(root);
	}
	/**
	 * 层序遍历
	 * 1.根节点入队列
	 * 2.while,队列不为空
	 * 		出该节点，遍历该节点
	 * 		如果该节点左节点不为空，左节点入队列
	 * 		如果该节点右节点不为空，右节点入队列
	 * 3.结束
	 * @param root
	 */
	public static void bfsTree(TreeNode root){
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(queue.size() > 0){
			TreeNode cur = queue.poll();
			System.out.println(cur.data);
			if(cur.left != null){
				queue.add(cur.left);
			}
			if(cur.right != null){
				queue.add(cur.right);
			}
		}
		return;
	}
	/**
	 * 层序遍历，返回每层的数组
	 * 1.根节点入队列
	 * 2.while,队列不为空
	 * 		出该节点，遍历该节点
	 * 		如果该节点左节点不为空，左节点入队列
	 * 		如果该节点右节点不为空，右节点入队列
	 * 3.结束
	 * @param root
	 */
	public static ArrayList<ArrayList<Integer>> bfsTreeList(TreeNode root){
		if(root == null){
			return null;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
		while(queue.size() > 0){
			int size = queue.size();
			ArrayList<Integer> subList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				//内部不变，最外面包了一层，记录节点。
				TreeNode cur = queue.poll();
				subList.add(cur.data);
				if(cur.left != null){
					queue.add(cur.left);
				}
				if(cur.right != null){
					queue.add(cur.right);
				}
			}
			resultList.add(subList);
		}
		return resultList;
	}
	/**
	 * 深度遍历，后续遍历，先放左节点，后放右节点
	 * 1.根节点入栈，
	 * 2.while,栈不为空
	 * 		出该节点，遍历该节点
	 * 		如果该节点左节点不为空，左节点入栈
	 * 		如果该节点右节点不为空，右节点入栈
	 * 3.结束
	 * @param root
	 */
	public static void dfsTreeRight(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);
		while(stack.size() > 0){
			TreeNode cur = stack.pop();
			System.out.println(cur.data);
			if(cur.left != null){
				stack.add(cur.left);
			}
			if(cur.right != null){
				stack.add(cur.right);
			}
		}
		return;
	}
	/**
	 * 深度遍历，前序续遍历，先放右节点，后放左节点
	 * @param root
	 */
	public static void dfsTreeLeft(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);
		while(stack.size() > 0){
			TreeNode cur = stack.pop();
			System.out.println(cur.data);
			if(cur.right != null){
				stack.add(cur.right);
			}
			if(cur.left != null){
				stack.add(cur.left);
			}
			
		}
		return;
	}
}
