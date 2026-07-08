/**
 * @Author kurumi
 * @Date 2026-07-08 下午2:48:12
 * @Description 70. 爬楼梯
 */
var climbStairs = function(n) {
  const dp = [1, 1];
  for (let i = 2; i <= n; i++) dp.push(dp[i - 1] + dp[i - 2]);
  return dp[n];
};

var climbStairs1 = function(n) {
  let d0 = 1, d1 = 1;
  for (let i = 2; i <= n; i++) [d0, d1] = [d1, d0 + d1];
  return d1;
};

console.log(climbStairs(3));