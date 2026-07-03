// 503. 下一个更大元素 II
package main

func nextGreaterElements(nums []int) []int {
	res := make([]int, len(nums))
	for i := 0; i < len(nums); i++ {
		res[i] = -1
	}
	st := make([]int, 0)
	for i := 0; i < len(nums)*2; i++ {
		for len(st) > 0 && nums[i%len(nums)] > nums[st[len(st)-1]] {
			res[st[len(st)-1]] = nums[i%len(nums)]
			st = st[:len(st)-1]
		}
		st = append(st, i%len(nums))
	}
	return res
}
