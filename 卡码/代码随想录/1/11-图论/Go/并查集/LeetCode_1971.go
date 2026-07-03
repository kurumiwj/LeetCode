// 1971. 寻找图中是否存在路径
func validPath(n int, edges [][]int, source int, destination int) bool {
	father := make([]int, n)
	for i := 0; i < n; i++ {
		father[i] = i
	}
	var find func(u int) int
	var isSame func(u, v int) bool
	var join func(u, v int)
	find = func(u int) int {
		if u == father[u] {
			return u
		} else {
			father[u] = find(father[u])
			return father[u]
		}
	}
	isSame = func(u, v int) bool {
		u = find(u)
		v = find(v)
		return u == v
	}
	join = func(u, v int) {
		u = find(u)
		v = find(v)
		if u == v {
			return
		}
		father[u] = v
	}
	for i := 0; i < len(edges); i++ {
		join(edges[i][0], edges[i][1])
	}
	return isSame(source, destination)
}