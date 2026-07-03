//376. 摆动序列
const wiggleMaxLength = function(nums) {
  if(nums.length<=1) return nums.length;
  let res=1,pre=0,cur=0;
  for(let i=1;i<nums.length;i++){
    cur=nums[i]-nums[i-1];
    if(pre<=0&&cur>0||pre>=0&&cur<0){
      res++;
      pre=cur;
    }
  }
  return res;
};