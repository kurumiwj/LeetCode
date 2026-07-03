//429. N 叉树的层序遍历
type Node struct {
	Val int
	Children []*Node
}

func levelOrder(root *Node) [][]int {
	res:=make([][]int,0)
	q:=make([]*Node,0)
	var size int
	if root!=nil {
		q=append(q,root)
	}
	for len(q)>0 {
		size=len(q)
		v:=make([]int,0)
		for size>0 {
			size--
			node:=q[0]
			q=q[1:]
			v=append(v,node.Val)
			for _,tmp:=range node.Children {
				q=append(q,tmp)
			}
		}
		res=append(res,v)
	}
	return res
}
