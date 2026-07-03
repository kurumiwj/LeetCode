//18. 链表的基本操作
package test18;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		List list = new List(new Node(-1));
		for(int i=0;i<n;i++) {
			list.insert(1,scanner.nextInt());
		}
		boolean flag;	//记录插入和删除是否成功标记
		n=scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++) {
			String[] op = scanner.nextLine().split(" ");
			switch(op[0]) {
				case "show":
					list.show();
					break;
				case "get":
					Node node = list.get(Integer.parseInt(op[1]));
					if(node==null) System.out.println("get fail");
					else System.out.println(node.getData());
					break;
				case "delete":
					flag = list.delete(Integer.parseInt(op[1]));
					if(flag) System.out.println("delete OK");
					else System.out.println("delete fail");
					break;
				case "insert":
					int index=Integer.parseInt(op[1]);
					flag = list.insert(index, Integer.parseInt(op[2]));
					if(flag) System.out.println("insert OK");
					else System.out.println("insert fail");
					break;
			}
		}
	}
}

class List{
	private Node head;
	private int length=0;

	public List(Node head) {
		this.head = head;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean insert(int index,int n) {
		//要插入位置小于1或者比链表长度+1还要大则插入失败
		if(index<1||index>this.getLength()+1) return false;
		Node node = new Node(n);
		Node tmp = head;
		int i=0;
		//找到插入的前一个节点
		while(tmp.getNext()!=null) {
			i++;
			if(index==i) break;
			tmp=tmp.getNext();
		}
		node.setNext(tmp.getNext());
		tmp.setNext(node);
		this.setLength(this.getLength()+1);
		return true;
	}
	public Node get(int n) {
		Node tmp=head.getNext();
		int index=1;
		while(tmp!=null) {
			if(index==n) return tmp;
			tmp=tmp.getNext();
			index++;
		}
		return null;
	}
	public void show() {
		Node tmp = head.getNext();
		if(tmp==null) {
			System.out.println("Link list is empty");
			return ;
		}
		while(tmp!=null) {
			if(tmp!=head.getNext()) System.out.print(" ");
			System.out.print(tmp.getData());
			tmp=tmp.getNext();
		}
		System.out.println();
	}
	public boolean delete(int index) {
		//如果要删除位置小于1或者比链表长度还要大则删除失败
		if(index<1||index>this.getLength()) return false;
		Node tmp=head;
		int i=0;
		//找到要删除的前一个节点
		while(tmp.getNext()!=null) {
			i++;
			if(i==index) break;
			tmp=tmp.getNext();
		}
		tmp.setNext(tmp.getNext().getNext());
		this.setLength(this.getLength()-1);
		return true;
	}
}

class Node{
	private int data;
	private Node next;
	public Node(int data) {
		this.data = data;
		this.next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "List [data=" + data + "]";
	}
}
