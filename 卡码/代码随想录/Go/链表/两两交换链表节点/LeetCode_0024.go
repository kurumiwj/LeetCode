//24. 两两交换链表中的节点
package main

type ListNode struct{
	Val int
	Next *ListNode
}

func swapPairs(head *ListNode) *ListNode {
	//链表为空或者只有一个元素
	if head==nil||head.Next==nil {
		return head
	}
	dummy:=&ListNode{-1,head}
	current:=dummy
	for current.Next!=nil&&current.Next.Next!=nil {
		tmp:=current.Next	//保留1号位
		tmp1:=tmp.Next.Next	//保留3号位
		current.Next=tmp.Next
		current.Next.Next=tmp
		tmp.Next=tmp1
		current=tmp
	}
	return dummy.Next
}
