//203. 移除链表元素
package main

import (
	"fmt"
)

type ListNode struct {
	Val int
	Next *ListNode
}

func removeElements(head *ListNode, val int) *ListNode {
	for head!=nil&&head.Val==val {
		head=head.Next
	}
	if head==nil {
		return nil
	}else{
		current:=head
		for current!=nil&&current.Next!=nil {
			if current.Next.Val==val {
				current.Next=current.Next.Next
			}else{
				current=current.Next
			}
		}
		return head
	}
}

func printList(head *ListNode){
	tmp:=head
	for tmp!=nil {
		fmt.Print(tmp.Val," ")
		tmp=tmp.Next
	}
}

func main(){
	list:=[]int{1,2,6,3,4,5,6}
	var head=&ListNode{-1,nil}
	tmp:=head
	for _,num:=range list {
		tmp.Next=&ListNode{num,nil}
		tmp=tmp.Next
	}
	head=head.Next
	printList(removeElements(head,6))
}
