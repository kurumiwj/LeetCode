//23. 二叉树的高度
package test23;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n=scanner.nextInt();
			String preOrder=scanner.next();
			String inOrder=scanner.next();
			Node root = Node.createTree(preOrder, inOrder, 0, n-1, 0, n-1);
			System.out.println(root.getHeight());
		}
	}
}
class Node{
	char data;
	Node left,right;
	
	public static Node createTree(String preOrder,String inOrder,int preLeft,int preRight,int inLeft,int inRight) {
		if(preLeft>preRight||inLeft>inRight) return null;
		int rootIndex=inOrder.indexOf(preOrder.charAt(preLeft));
		Node root=new Node(preOrder.charAt(preLeft));
		int leftNum=rootIndex-inLeft;
		root.left=Node.createTree(preOrder, inOrder, preLeft+1, preLeft+leftNum, inLeft, rootIndex-1);
		root.right=Node.createTree(preOrder, inOrder, preLeft+leftNum+1, preRight, rootIndex+1, inRight);
		return root;
	}
	public Node(char data) {
		this.data = data;
		this.left=null;
		this.right=null;
	}
	public int getHeight() {
		int leftHeight = 0,rightHeight = 0;
		if(this.left!=null) leftHeight=this.left.getHeight();
		if(this.right!=null) rightHeight=this.right.getHeight();
		return Integer.max(leftHeight, rightHeight)+1;
	}
}