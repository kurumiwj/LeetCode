// 406. 根据身高重建队列
package main

import (
	"sort"
	"slices"
)

func reconstructQueue(people [][]int) [][]int {
	q:=make([][]int,len(people))
	sort.Slice(people,func(i,j int) bool{
		if people[i][0]==people[j][0] {
			return people[i][1]<people[j][1]
		}else{
			return people[i][0]>people[j][0]
		}
	})
	for _,p:=range people {
		q=slices.Insert(q,p[1],p)
	}
	return q[:len(people)]
}
