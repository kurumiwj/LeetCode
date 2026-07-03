// 841. 钥匙和房间
package main

func canVisitAllRooms(rooms [][]int) bool {
	n := len(rooms)
	visited := make([]bool, n)
	for i := 0; i < n; i++ {
		visited[i] = false
	}
	var dfs func(key int)
	dfs = func(key int) {
		if visited[key] {
			return
		}
		visited[key] = true
		keys := rooms[key]
		for _, key := range keys {
			if !visited[key] {
				dfs(key)
			}
		}
	}
	dfs(0)
	for _, visit := range visited {
		if !visit {
			return false
		}
	}
	return true
}
