//142. 环形链表 II
package main

type ListNode struct{
	Val int
	Next *ListNode
}

func detectCycle(head *ListNode) *ListNode {
	fast,slow:=head,head
	for fast!=nil&&fast.Next!=nil {
		slow=slow.Next
		fast=fast.Next.Next
		//找到相交点则有环
		if slow==fast {
			index1,index2:=fast,head
			for index1!=index2 {
				index1=index1.Next
				index2=index2.Next
			}
			return index1
		}
	}
	return nil
}
