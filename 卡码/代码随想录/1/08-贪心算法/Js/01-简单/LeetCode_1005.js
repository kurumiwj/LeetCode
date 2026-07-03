//1005. K 次取反后最大化的数组和
const largestSumAfterKNegations = function(nums, k) {
  nums.sort((a,b)=>Math.abs(b)-Math.abs(a));
  let res=0;
  for(let i=0;i<nums.length;i++){
    if(nums[i]<0&&k>0){
      nums[i]=-nums[i];
      k--;
    }
    res+=nums[i];
  }
  if(k%2==1) res-=2*nums[nums.length-1];
  return res;
};