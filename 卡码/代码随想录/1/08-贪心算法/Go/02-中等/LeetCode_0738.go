// 738. 单调递增的数字
package main

import "strconv"

func monotoneIncreasingDigits(n int) int {
	nums:=[]byte(strconv.Itoa(n))
	start:=len(nums)
	for i:=len(nums)-1;i>0;i-- {
		if nums[i-1]>nums[i] {
			nums[i-1]--
			start=i
		}
	}
	for i:=start;i<len(nums);i++ {
		nums[i]='9'
	}
	res,_:=strconv.Atoi(string(nums))
	return res
}
