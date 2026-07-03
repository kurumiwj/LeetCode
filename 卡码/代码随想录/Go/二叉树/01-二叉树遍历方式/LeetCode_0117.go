package main

import "container/list"

type Node struct {
	Val int
	Left *Node
  Right *Node
  Next *Node
}

func connect(root *Node) *Node {
	q:=list.New()
	var cur,pre *Node
	if root!=nil {
		q.PushBack(root)
	}
	for q.Len()>0 {
		size:=q.Len()
		for i:=0;i<size;i++ {
			if i==0 {
				pre=q.Remove(q.Front()).(*Node)
				cur=pre
			}else{
				cur=q.Remove(q.Front()).(*Node)
				pre.Next=cur
				pre=cur
			}
			if cur.Left!=nil {
				q.PushBack(cur.Left)
			}
			if cur.Right!=nil {
				q.PushBack(cur.Right)
			}
		}
		pre.Next=nil
	}
	return root
}
