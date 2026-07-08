/**
 * @Author kurumi
 * @Date 2026-07-06 上午10:24:57
 * @Description 198. 打家劫舍
 */
var rob = function(nums) {
  let dp = new Array();
  dp[0] = nums[0];
  dp[1] = Math.max(nums[0], nums[1]);
  for (let i = 2; i < nums.length; i++) dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
  return dp[nums.length - 1];
};

var rob1 = function(nums) {
  if (nums.length == 1) return nums[0];
  d0 = nums[0];
  d1 = Math.max(nums[0], nums[1]);
  for (let i = 2; i < nums.length; i++) {
    let preD1 = d1;
    d1 = Math.max(preD1, d0 + nums[i]);
    d0 = preD1;
  }
  return d1;
};

console.log(rob1([1,2,3,1]));
console.log(rob1([2,7,9,3,1]));