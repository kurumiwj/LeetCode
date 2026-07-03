//209. 长度最小的子数组
package main

import "fmt"

func min(a,b int) int{
	if a<b {
		return a
	}
	return b
}

func minSubArrayLen(target int, nums []int) int {
	var i,sum,res=0,0,len(nums)+1
	for j:=0;j<len(nums);j++ {
		sum+=nums[j]
		for sum>=target {
			//更新最小长度
			res=min(res,j-i+1)
			//从总和中减去i位置的元素，比较下一阶段的序列和
			sum-=nums[i]
			i++
		}
	}
	if res<len(nums)+1 {
		return res
	}else{
		return 0
	}
}

func main(){
	target:=7
	nums:=[]int{2,3,1,2,4,3}
	fmt.Println(minSubArrayLen(target,nums))
}
