//19. 删除链表的倒数第 N 个结点
package main

type ListNode struct{
	Val int
	Next *ListNode
}

func removeNthFromEnd(head *ListNode, n int) *ListNode {
	dummy:=&ListNode{-1,head}
	fast,slow:=dummy,dummy
	n++
	for n>0 {
		fast=fast.Next
		n--
	}
	for fast!=nil {
		fast=fast.Next
		slow=slow.Next
	}
	slow.Next=slow.Next.Next
	return dummy.Next
}
