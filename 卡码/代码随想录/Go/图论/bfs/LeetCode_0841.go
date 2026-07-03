// 841. 钥匙和房间
package main

func canVisitAllRooms(rooms [][]int) bool {
	n := len(rooms)
	var bfs func() bool
	bfs = func() bool {
		visited := make([]bool, n)
		for i := 0; i < n; i++ {
			visited[i] = false
		}
		visited[0] = true
		q := []int{0}
		for len(q) > 0 {
			k := q[0]
			q = q[1:]
			keys := rooms[k]
			for _, key := range keys {
				if !visited[key] {
					visited[key] = true
					q = append(q, key)
				}
			}
		}
		for _, visit := range visited {
			if !visit {
				return false
			}
		}
		return true
	}
	return bfs()
}
