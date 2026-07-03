// 56. 合并区间
package main

import (
	"math"
	"sort"
)

func merge(intervals [][]int) [][]int {
	res:=make([][]int,0)
	sort.Slice(intervals,func (i,j int) bool{
		return intervals[i][0]<intervals[j][0]
	})
	res=append(res,intervals[0])
	for i:=1;i<len(intervals);i++ {
		if intervals[i][0]<=res[len(res)-1][1] {
			res[len(res)-1][1]=int(math.Max(float64(intervals[i][1]),float64(res[len(res)-1][1])))
		}else{
			res=append(res,intervals[i])
		}
	}
	return res
}
