//239. 滑动窗口最大值
package main

import "fmt"

type Queue struct{
	queue []int
}
func (this *Queue) front() int{
	return this.queue[0]
}
func (this *Queue) back() int{
	return this.queue[len(this.queue)-1]
}
func (this *Queue) empty() bool{
	return len(this.queue)==0
}
func (this *Queue) push(val int){
	for !this.empty()&&val>this.back() {
		this.queue=this.queue[:len(this.queue)-1]
	}
	this.queue=append(this.queue,val)
}
func (this *Queue) pop(val int){
	if !this.empty()&&this.front()==val {
		this.queue=this.queue[1:]
	}
}

func maxSlidingWindow(nums []int, k int) []int {
	queue:=&Queue{make([]int,0)}
	res:=make([]int,0)
	for i:=0;i<k;i++ {
		queue.push(nums[i])
	}
	res=append(res,queue.front())
	for i:=k;i<len(nums);i++ {
		queue.pop(nums[i-k])
		queue.push(nums[i])
		res=append(res,queue.front())
	}
	return res
}

func main(){
	fmt.Println(maxSlidingWindow([]int{1,3,-1,-3,5,3,6,7},3))
}
