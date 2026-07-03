//134. 加油站
package main

func canCompleteCircuit(gas []int, cost []int) int {
	start,current,total:=0,0,0
	for i:=0;i<len(gas);i++ {
		current+=(gas[i]-cost[i])
		total+=(gas[i]-cost[i])
		if current<0 {
			current=0
			start=i+1
		}
	}
	if total<0 {
		return -1
	}
	return start
}
