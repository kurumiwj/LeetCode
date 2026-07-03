//面试题 02.07. 链表相交
package _06_链表相交;

public class LeetCode_02_07 {

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
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
  	int lenA=0,lenB=0,gap=0;
  	ListNode tmpA=headA,tmpB=headB;
  	ListNode maxNode,minNode;
  	while(tmpA!=null) {
  		lenA++;
  		tmpA=tmpA.next;
  	}
  	while(tmpB!=null) {
  		lenB++;
  		tmpB=tmpB.next;
  	}
  	if(lenA>lenB) {
  		gap=lenA-lenB;
  		maxNode=headA;
  		minNode=headB;
  	}else {
  		gap=lenB-lenA;
  		maxNode=headB;
  		minNode=headA;
  	}
  	while(gap-->0) maxNode=maxNode.next;
  	while(maxNode!=null) {
  		if(maxNode==minNode) return maxNode;
  		maxNode=maxNode.next;
  		minNode=minNode.next;
  	}
  	return null;
  }
}