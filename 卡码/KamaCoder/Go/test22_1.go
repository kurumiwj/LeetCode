//22. 二叉树的遍历
package main

import (
	"fmt"
)

var (
	nodes []Node
)

type Node struct{
	data byte
	left,right int
}
func (this Node) preOrder(){
	fmt.Printf("%c",this.data)
	if this.left!=0 {
		nodes[this.left].preOrder()
	}
	if this.right!=0 {
		nodes[this.right].preOrder()
	}
}
func (this Node) inOrder(){
	if this.left!=0 {
		nodes[this.left].inOrder()
	}
	fmt.Printf("%c",this.data)
	if this.right!=0 {
		nodes[this.right].inOrder()
	}
}
func (this Node) postOrder(){
	if this.left!=0 {
		nodes[this.left].postOrder()
	}
	if this.right!=0 {
		nodes[this.right].postOrder()
	}
	fmt.Printf("%c",this.data)
}

func main(){
	var n int
	fmt.Scanf("%d\n",&n)
	nodes=make([]Node,n+1,n+1)
	var data byte
	var left,right int
	for i:=1;i<=n;i++ {
		fmt.Scanf("%c %d %d\n",&data,&left,&right)
		nodes[i]=Node{data,left,right}
	}
	nodes[1].preOrder()
	println()
	nodes[1].inOrder()
	println()
	nodes[1].postOrder()
}
