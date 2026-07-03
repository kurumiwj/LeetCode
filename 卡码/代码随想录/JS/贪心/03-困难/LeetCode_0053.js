//53. 最大子数组和
const maxSubArray = function(nums) {
  let res=-Infinity,cnt=0;
  for(let num of nums){
    cnt+=num;
    if(cnt>res) res=cnt;
    if(cnt<0) cnt=0;
  }
  return res;
};