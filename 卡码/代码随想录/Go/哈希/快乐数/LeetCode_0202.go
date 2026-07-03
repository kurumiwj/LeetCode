//202. 快乐数
package main

func getSum(n int) int{
	sum:=0
	for n>0 {
		sum+=(n%10)*(n%10)
		n/=10
	}
	return sum
}

func isHappy(n int) bool {
	set:=make(map[int]bool)
	for n!=1&&!set[n] {
		n,set[n]=getSum(n),true
	}
	return n==1
}
