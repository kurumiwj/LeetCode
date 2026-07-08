'''
@Author kurumi
@Date 2026-07-08 下午4:41:59
@Description 746. 使用最小花费爬楼梯
'''
class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        n: int = len(cost)
        dp: list = [0] * (n + 1)
        for i in range(2, n + 1):
            dp[i] = min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2])
        return dp[n]

class Solution1:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        n: int = len(cost)
        d0, d1 = 0, 0
        for i in range(2, n + 1):
            d0, d1 = d1, min(d1 + cost[i - 1], d0 + cost[i - 2])
        return d1