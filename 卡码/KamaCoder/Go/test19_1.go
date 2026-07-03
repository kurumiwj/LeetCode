//19. 单链表反转
package main

import (
	"fmt"
)

type Node struct{
	data int
	next *Node
}

func main(){
	for {
		var n int
		_,err:=fmt.Scan(&n)
		if err!=nil {
			return
		}
		if n==0 {
			fmt.Println("list is empty")
			continue
		}
		var head=&Node{-1,nil}
		for i:=0;i<n;i++ {
			var tmp int
			fmt.Scan(&tmp)
			fmt.Print(tmp)
			if i!=n-1 {
				fmt.Print(" ")
			}
			cur:=&Node{tmp,head.next}
			head.next=cur
		}
		fmt.Println()
		tmp:=head.next
		for tmp!=nil {
			fmt.Print(tmp.data)
			if tmp.next!=nil {
				fmt.Print(" ")
			}
			tmp=tmp.next
		}
		fmt.Println()
	}
}
