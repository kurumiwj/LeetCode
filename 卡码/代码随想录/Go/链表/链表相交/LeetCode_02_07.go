//面试题 02.07. 链表相交
package main

type ListNode struct{
	Val int
	Next *ListNode
}

func getIntersectionNode(headA, headB *ListNode) *ListNode {
	lenA,lenB:=0,0	//A,B长度
	tmpA,tmpB:=headA,headB
	for tmpA!=nil {
		lenA++
		tmpA=tmpA.Next
	}
	for tmpB!=nil {
		lenB++
		tmpB=tmpB.Next
	}
	var gap int	//最大长度与最小长度之差
	var maxNode,minNode *ListNode	//最大、最小长度对应的链表
	if lenA>lenB {
		gap=lenA-lenB
		maxNode=headA
		minNode=headB
	}else{
		gap=lenB-lenA
		maxNode=headB
		minNode=headA
	}
	for gap>0 {
		maxNode=maxNode.Next
		gap--
	}
	for maxNode!=nil {
		if maxNode==minNode {
			return maxNode
		}
		maxNode=maxNode.Next
		minNode=minNode.Next
	}
	return nil
}
