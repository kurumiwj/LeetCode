//122. 买卖股票的最佳时机 II
package main

func maxProfit(prices []int) int {
	res:=0
	for i:=1;i<len(prices);i++ {
		tmp:=prices[i]-prices[i-1]
		if tmp>0 {
			res+=tmp
		}
	}
	return res
}
