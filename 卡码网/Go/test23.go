// 23. 二叉树的高度
package main

import (
	"fmt"
	"strings"
)

type Node struct{
	data string
	left,right *Node
}

func Max(a,b int) int{
	if a>b {
		return a
	}
	return b
}

func Index(nodes []string,target string) int{
	res:=-1
	for index,value:=range nodes {
		if value==target{
			res=index
			break
		}
	}
	return res
}

//创建二叉树
func createTree(pre,in []string,preLeft,preRight,inLeft,inRight int) *Node{
	if preLeft>preRight||inLeft>inRight {
		return nil
	}
	if preLeft==preRight {
		return &Node{pre[preLeft],nil,nil}
	}
	rootIndex:=Index(in,pre[preLeft])
	root:=&Node{pre[preLeft],createTree(pre,in,preLeft+1,preLeft+rootIndex-inLeft,inLeft,rootIndex-1),createTree(pre,in,preLeft+rootIndex-inLeft+1,preRight,rootIndex+1,inRight)}
	return root
}

//获取树高
func getHeight(root *Node) int{
	if root==nil {
		return 0
	}
	return Max(getHeight(root.left),getHeight(root.right))+1
}

func main(){
	for {
		var n int
		_,err:=fmt.Scanf("%d\n",&n)
		if err!=nil {
			return
		}
		var preStr,inStr string
		fmt.Scanln(&preStr)
		fmt.Scanln(&inStr)
		preNodes:=strings.Split(preStr,"")
		inNodes:=strings.Split(inStr,"")
		root:=createTree(preNodes,inNodes,0,n-1,0,n-1)
		fmt.Println(getHeight(root))
	}
}
