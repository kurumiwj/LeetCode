//21. 构造二叉树
package test21;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] line = scanner.nextLine().split(" ");
			String pre=line[0];
			String in=line[1];
			Node root = Node.createBTree(pre, in, 0, pre.length()-1, 0, in.length()-1);
			root.postOrder(root);
			System.out.println();
		}
	}
}

class Node{
	char data;
	Node left;
	Node right;
	public Node(char data) {
		this.data = data;
		this.left=null;
		this.right=null;
	}
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	public static Node createBTree(String pre,String in,int preLeft,int preRight,int inLeft,int inRight) {
		if(preLeft>preRight||inLeft>inRight) return null;
		Node root=new Node(pre.charAt(preLeft));
		int rootIndex = in.indexOf(root.getData());	//中序遍历根节点的位置
		int leftNum=rootIndex-inLeft;	//左子树个数
		int rightNum=inRight-rootIndex;	//右子树个数
		root.setLeft(createBTree(pre, in, preLeft+1, preLeft+leftNum, inLeft, rootIndex-1));
		root.setRight(createBTree(pre, in, preLeft+leftNum+1, preRight, rootIndex+1, inRight));
		return root;
	}
	public void postOrder(Node root) {
		if(root==null) return;
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData());
	}
}
