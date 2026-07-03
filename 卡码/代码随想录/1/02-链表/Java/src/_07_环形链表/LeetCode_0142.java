//142. 环形链表 II
package _07_环形链表;

public class LeetCode_0142 {

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
  public ListNode detectCycle(ListNode head) {
  	ListNode fast=head,slow=head;
  	while(fast!=null&&fast.next!=null) {
  		fast=fast.next.next;
  		slow=slow.next;
  		//找到相交点则有环
  		if(fast==slow) {
  			ListNode index1=fast,index2=head;
  			while(index1!=index2) {
  				index1=index1.next;
  				index2=index2.next;
  			}
  			return index1;
  		}
  	}
  	return null;
  }
}