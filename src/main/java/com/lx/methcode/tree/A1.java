package com.lx.methcode.tree;
/**
 * 计算二叉树的最大深度
 * @author lixiongxiong01
 *
 */
public class A1 {
	/**
	 * 递归思路
	 * 定义函数：f(n)计算树的高度
	 * 结束条件：当前节点为空返回0；
	 * 等价关系：
	 * 			f(n) = max(f(n.left),f(n.right))+1;
	 */
	public static void main(String[] args){
		//构造树
		TreeNode root= createTree();
		System.out.println(findDeep(root));
	}
	public static int findDeep(TreeNode root){
		if(root == null){
			return 0;
		}
		int result = Math.max(findDeep(root.left), findDeep(root.right))+1;
		return result;
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
	
	/**
	 *    1
	 *  2   2
	 * 3 4 4 3
	 * @return
	 */
	public static TreeNode createTree2(){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		return root;
	}
}
