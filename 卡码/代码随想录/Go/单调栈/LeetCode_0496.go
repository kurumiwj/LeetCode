// 496. 下一个更大元素 I
package main

func nextGreaterElement(nums1 []int, nums2 []int) []int {
	res := make([]int, len(nums1))
	for i := 0; i < len(nums1); i++ {
		res[i] = -1
	}
	st := make([]int, 0)
	m := make(map[int]int, 0)
	for index, num := range nums1 {
		m[num] = index
	}
	for index, num := range nums2 {
		for len(st) > 0 && num > nums2[st[len(st)-1]] {
			if _, ok := m[nums2[st[len(st)-1]]]; ok {
				res[m[nums2[st[len(st)-1]]]] = num
			}
			st = st[:len(st)-1]
		}
		st = append(st, index)
	}
	return res
}
