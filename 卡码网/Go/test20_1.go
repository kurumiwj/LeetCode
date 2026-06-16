//20. 删除重复元素
package main

import (
	"fmt"
)

type Node struct{
	data int
	next *Node
}

func NewNode(n int) *Node{
	return &Node{n,nil}
}

func main(){
	var n int
	for {
		_,err:=fmt.Scan(&n)
		if err!=nil {
			return
		}
		if n==0 {
			fmt.Println("list is empty")
			continue
		}
		linkedList:=NewNode(-1)
		var current=linkedList
		for i:=0;i<n;i++ {
			var next=NewNode(0)
			fmt.Scan(&next.data)
			if i!=0 {
				fmt.Print(" ")
			}
			fmt.Print(next.data)
			if next.data!=current.data {
				current.next=next
				current=next
			}
		}
		fmt.Println()
		current=linkedList.next
		for current!=nil {
			fmt.Print(current.data)
			if current.next!=nil {
				fmt.Print(" ")
			}
			current=current.next
		}
		fmt.Println()
	}
}
