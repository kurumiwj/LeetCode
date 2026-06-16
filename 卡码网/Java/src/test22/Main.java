//22. 二叉树的遍历
package test22;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		Node.nodes=new Node[n+1];
		for(int i=1;i<=n;i++) {
			char ch=scanner.next().charAt(0);
			int left=scanner.nextInt();
			int right=scanner.nextInt();
			Node.nodes[i]=new Node(ch,left,right);
		}
		Node.nodes[1].preOrder();
		System.out.println();
		Node.nodes[1].inOrder();
		System.out.println();
		Node.nodes[1].postOrder();
	}
}
class Node{
	static Node[] nodes;
	char data;
	int left,right;
	
	public Node(char data,int left,int right) {
		this.data = data;
		this.left=left;
		this.right=right;
	}
	//先序遍历
	void preOrder() {
		System.out.print(this.data);
		if(this.left!=0) nodes[this.left].preOrder();
		if(this.right!=0) nodes[this.right].preOrder();
	}
	//中序遍历
	void inOrder() {
		if(this.left!=0) nodes[this.left].inOrder();
		System.out.print(this.data);
		if(this.right!=0) nodes[this.right].inOrder();
	}
	//后序遍历
	void postOrder() {
		if(this.left!=0) nodes[this.left].postOrder();
		if(this.right!=0) nodes[this.right].postOrder();
		System.out.print(this.data);
	}
}