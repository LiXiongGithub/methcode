package com.lx.methcode.tree;
/**
 * 验证对称二叉树
 *       1
 *   2       2
 * 3   4   4   3
 *5 6 7 8 5 6 7  8
 *函数定义，左子树，与右子树的元素是否一样
 *f(3) = f(1.left.left,1.right.right) && f(1.left.right,1.right.left)
 *结束条件：
 *1.如果，root的左右都为空，返回true
 *2.如果，左右不相等，返回false
 *等价式:
 *否则，比较左右子树的下一层。
 * @author lixiongxiong01
 *
 */
public class A3 {
	public static void main(String[] args){
		TreeNode root= A1.createTree2();
		System.out.println(judge(root.left,root.right));
	}
	public static boolean judge(TreeNode left,TreeNode right){
		if(left == null && right == null){
			return true;
		}
		if(left == null || right == null || left.data != right.data){
			return false;
		}
		boolean result = judge(left.left, right.right) && judge(left.right, right.left);
		return result;
	}
}
