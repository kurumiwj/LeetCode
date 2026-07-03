//116. 填充每个节点的下一个右侧节点指针
package main

type Node struct {
	Val int
	Left *Node
  Right *Node
  Next *Node
}

func connect(root *Node) *Node {
	q:=make([]*Node,0)
	var cur,pre *Node
	if root!=nil {
		q=append(q,root)
	}
	for len(q)>0 {
		size:=len(q)
		for i:=0;i<size;i++ {
			if i==0 {
				pre=q[0]
				q=q[1:]
				cur=pre
			}else{
				cur=q[0]
				q=q[1:]
				pre.Next=cur
				pre=cur
			}
			if cur.Left!=nil {
				q=append(q,cur.Left)
			}
			if cur.Right!=nil {
				q=append(q,cur.Right)
			}
		}
		pre.Next=nil
	}
	return root
}
