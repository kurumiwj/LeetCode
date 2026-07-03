// 684. 冗余连接
package main

func findRedundantConnection(edges [][]int) []int {
	n := len(edges)
	father := make([]int, n+1)
	for i := 0; i < n+1; i++ {
		father[i] = i
	}
	var find func(u int) int
	var isSame func(u, v int) bool
	var join func(u, v int)
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
	res := make([]int, 2)
	for _, edge := range edges {
		if isSame(edge[0], edge[1]) {
			copy(res, edge)
		} else {
			join(edge[0], edge[1])
		}
	}
	return res
}
