//559. N 叉树的最大深度
package main

type Node struct {
	Val int
	Children []*Node
}

func maxDepth(root *Node) int {
	if root==nil {
		return 0
	}
	var depth int=0
	for _,node:=range root.Children {
		depth=max(depth,maxDepth(node))
	}
	return 1+depth
}
