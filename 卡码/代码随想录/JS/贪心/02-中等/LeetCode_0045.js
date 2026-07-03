//45. 跳跃游戏 II
const jump = function(nums) {
  let res=0,cur=0,next=0;
  for(let i=0;i<nums.length-1;i++){
    next=Math.max(next,i+nums[i]);
    if(i==cur){
      cur=next;
      res++;
    }
  }
  return res;
};