//454. 四数相加 II
func fourSumCount(nums1 []int, nums2 []int, nums3 []int, nums4 []int) int {
	sum:=0
	hash:=make(map[int]int)
	for _,num1:=range nums1 {
		for _,num2:=range nums2 {
			hash[num1+num2]++
		}
	}
	for _,num3:=range nums3 {
		for _,num4:=range nums4 {
			target:=-(num3+num4)
			if value,ok:=hash[target];ok {
				sum+=value
			}
		}
	}
	return sum
}
