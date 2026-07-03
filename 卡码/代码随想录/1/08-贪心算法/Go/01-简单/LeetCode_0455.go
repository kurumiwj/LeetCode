//455. 分发饼干
package main

import "sort"

func findContentChildren(g []int, s []int) int {
	sort.Ints(g)
	sort.Ints(s)
	index:=len(s)-1
	res:=0
	for i:=len(g)-1;i>=0;i-- {
		if index<0 {
			break
		}
		if s[index]>=g[i] {
			res++
			index--
		}
	}
	return res
}
