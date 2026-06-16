//22. 二叉树的遍历
package main

import (
	"fmt"
)

type Node struct{
	data int
	left,right *Node
}

func Index(nodes []byte,ch byte) int{
	res:=-1
	for i:=1;i<len(nodes);i++ {
		if nodes[i]==ch {
			res=i
			break
		}
	}
	return res
}

//创建二叉树
func createTree(nodes []Node,leftNodes []int,rightNodes []int,index int) *Node{
	var root=&nodes[index]
	if leftNodes[index]!=0 {
		root.left=createTree(nodes,leftNodes,rightNodes,leftNodes[index])
	}
	if rightNodes[index]!=0 {
		root.right=createTree(nodes,leftNodes,rightNodes,rightNodes[index])
	}
	return root
}

//先序遍历
func preOrder(dict []byte,root *Node){
	fmt.Printf("%c",dict[root.data])
	if root.left!=nil {
		preOrder(dict,root.left)
	}
	if root.right!=nil {
		preOrder(dict,root.right)
	}
}

//中序遍历
func inOrder(dict []byte,root *Node){
	if root.left!=nil {
		inOrder(dict,root.left)
	}
	fmt.Printf("%c",dict[root.data])
	if root.right!=nil {
		inOrder(dict,root.right)
	}
}

//后序遍历
func postOrder(dict []byte,root *Node){
	if root.left!=nil {
		postOrder(dict,root.left)
	}
	if root.right!=nil {
		postOrder(dict,root.right)
	}
	fmt.Printf("%c",dict[root.data])
}

func main(){
	var n int
	fmt.Scanln(&n)
	var dict=make([]byte,n+1,n+1)
	var nodes=make([]Node,n+1)
	var leftNodes=make([]int,n+1)	//记录第i个节点的左子节点
	var rightNodes=make([]int,n+1)	//记录第i个节点的右子节点
	for i:=1;i<=n;i++ {
		var ch byte
		var left,right int
		fmt.Scanf("%c %d %d\n",&ch,&left,&right)
		dict[i]=ch
		nodes[i]=Node{i,nil,nil}
		leftNodes[i]=left
		rightNodes[i]=right
	}
	root:=createTree(nodes,leftNodes,rightNodes,1)
	preOrder(dict,root)
	fmt.Println()
	inOrder(dict,root)
	fmt.Println()
	postOrder(dict,root)
}
