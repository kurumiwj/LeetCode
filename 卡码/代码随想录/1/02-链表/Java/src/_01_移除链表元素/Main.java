//203. 移除链表元素
package _01_移除链表元素;

public class Main {
	public static void main(String[] args) {

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
  public ListNode removeElements(ListNode head, int val) {
  	while(head!=null&&head.val==val) {	//找到第一个不等于val的头结点
  		head=head.next;
  	}
  	ListNode current=head;
  	while(current!=null&&current.next!=null) {
  		if(current.next.val==val) {
  			current.next=current.next.next;
  		}else current=current.next;
  	}
  	return head;
  }
}
