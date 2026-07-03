//206. 反转链表
package _03_反转链表;

public class Main {
	public static void main(String[] args) {
		
	}
}
class ListNode{
	int val;
	ListNode next;
	
	public ListNode() {
		super();
	}
	public ListNode(int val) {
		super();
		this.val = val;
	}
	public ListNode(int val, ListNode next) {
		super();
		this.val = val;
		this.next = next;
	}
}
class Solution {
	//递归
	public ListNode reverseList(ListNode head) {
		//链表为空或者只有一个节点
		if(head==null||head.next==null) return head;
		ListNode node=reverseList(head.next);
		head.next.next=head;
		head.next=null;
		return node;
	}
	//双指针法
  public ListNode reverseList1(ListNode head) {
  	//链表为空或者只有一个节点
  	if(head==null||head.next==null) return head;
  	ListNode pre=null;
  	ListNode cur=head;
  	while(cur!=null) {
  		ListNode tmp=cur.next;
  		cur.next=pre;
  		pre=cur;
  		cur=tmp;
  	}
  	return pre;
  }
}