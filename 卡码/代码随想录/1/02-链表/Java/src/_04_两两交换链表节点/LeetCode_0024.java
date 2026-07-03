//24. 两两交换链表中的节点
package _04_两两交换链表节点;

public class LeetCode_0024 {

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
	public ListNode swapPairs(ListNode head) {
		//如果链表为空或者只有一个元素
		if(head==null||head.next==null) return head;
		ListNode dummy = new ListNode(-1,head);
		ListNode current=dummy;
		while(current.next!=null&&current.next.next!=null) {
			ListNode tmp=current.next;	//保留1号位
			ListNode tmp1=tmp.next.next;	//保留3号位
			current.next=tmp.next;
			current.next.next=tmp;
			tmp.next=tmp1;
			current=tmp;
		}
		return dummy.next;
	}
}
