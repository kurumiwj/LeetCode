package main

import (
	"fmt"
)

type MyLinkedList struct {
	val int
	next *MyLinkedList
}

func Constructor() MyLinkedList {
	return MyLinkedList{-1,nil}
}

func (this *MyLinkedList) Get(index int) int {
	if this.next==nil {
		return -1
	}else{
		current:=this.next
		n:=0
		for current!=nil {
			n++
			if n==index {
				return current.val
			}
			current=current.next
		}
		return -1
	}
}

func (this *MyLinkedList) AddAtHead(val int)  {
	node:=Constructor(val)
	node.next=this.next
	this.next=node
}

func (this *MyLinkedList) AddAtTail(val int)  {
	current:=this
	node:=Constructor(val)
	for current.next!=nil {
		current=current.next
	}
	current.next=node
}

func (this *MyLinkedList) AddAtIndex(index int, val int)  {
	n:=0
	current:=this
	node:=Constructor(val)
	for current.next!=nil {
		n++
		if n==index {
			node.next=current.next
			current.next=node
		}
		current=current.next
	}
}

func (this *MyLinkedList) DeleteAtIndex(index int)  {
	n:=0
	current:=this
	for current.next!=nil {
		n++
		if n==index {
			current.next=current.next.next
			return
		}
		current=current.next
	}
}
