//19. 删除链表的倒数第 N 个结点
package _05_删除链表倒数第n个节点;

public class LeetCode_0019 {

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
  public ListNode removeNthFromEnd(ListNode head, int n) {
  	ListNode dummy=new ListNode(-1,head);
  	ListNode fast=dummy,slow=dummy;
  	n++;
  	while(n-->0) {
  		fast=fast.next;
  	}
  	while(fast!=null) {
  		fast=fast.next;
  		slow=slow.next;
  	}
  	slow.next=slow.next.next;
  	return dummy.next;
  }
}