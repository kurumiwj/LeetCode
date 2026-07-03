//376. 摆动序列
package main

func wiggleMaxLength(nums []int) int {
	if len(nums)<=1 {
		return len(nums)
	}
	res,pre,cur:=1,0,0
	for i:=1;i<len(nums);i++ {
		cur=nums[i]-nums[i-1]
		if cur>0&&pre<=0||cur<0&&pre>=0 {
			res++
			pre=cur
		}
	}
	return res
}
