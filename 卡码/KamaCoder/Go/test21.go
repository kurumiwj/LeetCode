// 21. 构造二叉树
package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

type Node struct{
	data byte
	left,right *Node
}

func NewNode(n byte) *Node{
	return &Node{n,nil,nil}
}

func createBT(preOrder,inOrder string) *Node{
	//查找二叉树的根
	var rootIndex=strings.IndexByte(inOrder,preOrder[0])
	//未找到根
	if rootIndex==-1 {
		return nil
	}
	root:=NewNode(preOrder[0])
	//如果当前子树只有一个节点则直接返回
	//递归构建左子树
	if rootIndex>0 {
		root.left=createBT(preOrder[1:rootIndex+1],inOrder[:rootIndex])
	}
	//递归构建右子树
	if rootIndex<len(inOrder)-1 {
		root.right=createBT(preOrder[rootIndex+1:],inOrder[rootIndex+1:])
	}
	return root
}

//后序遍历
func postTraversal(root *Node){
	if root==nil {
		return
	}
	postTraversal(root.left)
	postTraversal(root.right)
	fmt.Printf("%c",root.data)
}

func main(){
	reader:=bufio.NewReader(os.Stdin)
	for {
		line,_,err:=reader.ReadLine()
		if err!=nil {
			return
		}
		list:=strings.Fields(string(line))
		//先序，中序
		preOrder,inOrder:=list[0],list[1]
		tree:=createBT(preOrder,inOrder)
		postTraversal(tree)
		fmt.Println()
	}
}
