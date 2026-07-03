//206. 反转链表
package main

import (
	"fmt"
)

type ListNode struct{
	Val int
	Next *ListNode
}

//双指针法
func reverseList1(head *ListNode) *ListNode {
	//链表为空或者只有一个节点
	if head==nil||head.Next==nil {
		return head
	}
	var pre *ListNode=nil
	cur:=head
	for cur!=nil {
		tmp:=cur.Next
		cur.Next=pre
		pre=cur
		cur=tmp
	}
	return pre
}

//递归
func reverseList(head *ListNode) *ListNode {
	//链表为空或者只有一个节点
	if head==nil||head.Next==nil {
		return head
	}
	node:=reverseList(head.Next)
	head.Next.Next=head
	head.Next=nil
	return node
}

