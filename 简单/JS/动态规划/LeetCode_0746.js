/**
 * @Author kurumi
 * @Date 2026-07-08 下午4:41:59
 * @Description 746. 使用最小花费爬楼梯
 */
var minCostClimbingStairs = function(cost) {
  const n = cost.length;
  const dp = new Array(n + 1).fill(0);
  for (let i = 2; i <= n; i++) dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
  return dp[n];
};

var minCostClimbingStairs1 = function(cost) {
  const n = cost.length;
  let d0 = 0, d1 = 0;
  for (let i = 2; i <= n; i++) {
    let preD1 = d1;
    d1 = Math.min(d1 + cost[i - 1], d0 + cost[i - 2]);
    d0 = preD1;
  }
  return d1;
};