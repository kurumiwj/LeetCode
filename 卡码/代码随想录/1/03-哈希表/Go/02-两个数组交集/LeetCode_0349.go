//349. 两个数组的交集
package main

// import "github.com/emirpasic/gods/sets/hashset"

func intersection(nums1 []int, nums2 []int) []int {
	hash:=make(map[int]bool)
	// res:=hashset.New()
	res:=make(map[int]bool)
	for _,num:=range nums1 {
		hash[num]=true
	}
	for _,num:=range nums2 {
		if _,ok:=hash[num];ok {
			// res.Add(num)
			res[num]=true
		}
	}
	result:=make([]int,len(res))
	index:=0
	for key,_:=range res {
		result[index]=key
		index++
	}
	return result
}
