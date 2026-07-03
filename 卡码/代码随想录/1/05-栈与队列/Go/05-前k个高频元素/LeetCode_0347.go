//347. 前K个高频元素
package main

import (
	"container/heap"
)

type IHeap [][2]int	//小顶堆

func (h IHeap) Len() int{
	return len(h)
}

func (h IHeap) Less(i,j int) bool{
	return h[i][1]<h[j][1]
}

func (h IHeap) Swap(i,j int){
	h[i],h[j]=h[j],h[i]
}

func (h *IHeap) Push(x interface{}){
	*h=append(*h,x.([2]int))
}

func (h *IHeap) Pop() interface{}{
	n:=len(*h)
	res:=(*h)[n-1]
	*h=(*h)[:n-1]
	return res
}

func topKFrequent(nums []int, k int) []int {
	m:=make(map[int]int)
	for _,num:=range nums {
		m[num]++
	}
	h:=&IHeap{}
	heap.Init(h)
	for key,value:=range m {
		heap.Push(h,[2]int{key,value})
		//如果小顶堆元素大于k个则弹出
		if h.Len()>k {
			heap.Pop(h)
		}
	}
	res:=make([]int,k)
	for i:=k-1;i>=0;i-- {
		res[i]=heap.Pop(h).([2]int)[0]
	}
	return res
}
