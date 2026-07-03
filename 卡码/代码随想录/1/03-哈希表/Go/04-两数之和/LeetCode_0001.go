//1. 两数之和
func twoSum(nums []int, target int) []int {
	hash:=make(map[int]int)
	for i,num:=range nums {
		//判断是否有两数之和等于target
		if index,ok:=hash[target-num];ok {
			return []int{index,i}
		}
		//将当前数字添加到map中
		hash[num]=i
	}
	return []int{}
}
