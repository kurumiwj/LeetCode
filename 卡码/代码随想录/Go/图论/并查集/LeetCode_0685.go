// 685. 冗余连接 II
package main

func findRedundantDirectedConnection(edges [][]int) []int {
	n := len(edges)
	father := make([]int, n+1)
	var init func()
	var find func(u int) int
	var isSame func(u, v int) bool
	var join func(u, v int)
	var removeEdge func() []int
	var isTreeAfterRemoveEdge func(edge int) bool
	init = func() {
		for i := 0; i < n; i++ {
			father[i] = i
		}
	}
	find = func(u int) int {
		if u == father[u] {
			return u
		}
		father[u] = find(father[u])
		return father[u]
	}
	isSame = func(u, v int) bool {
		u, v = find(u), find(v)
		return u == v
	}
	join = func(u, v int) {
		u, v = find(u), find(v)
		if u == v {
			return
		}
		father[v] = u
	}
	removeEdge = func() []int {
		init()
		res := make([]int, 0)
		for _, edge := range edges {
			if isSame(edge[0], edge[1]) {
				res = append(res, edge...)
			} else {
				join(edge[0], edge[1])
			}
		}
		return res
	}
	isTreeAfterRemoveEdge = func(edge int) bool {
		init()
		for i, e := range edges {
			if i == edge {
				continue
			}
			if isSame(e[0], e[1]) {
				return false
			}
			join(e[0], e[1])
		}
		return true
	}
	inDegrees := make([]int, n+1)
	for i := 0; i < n; i++ {
		inDegrees[edges[i][1]]++
	}
	v2 := make([]int, 0)
	for i := n - 1; i >= 0; i-- {
		if inDegrees[edges[i][1]] == 2 {
			v2 = append(v2, i)
		}
	}
	if len(v2) > 1 {
		if isTreeAfterRemoveEdge(v2[0]) {
			return edges[v2[0]]
		}
		return edges[v2[1]]
	}
	return removeEdge()
}
