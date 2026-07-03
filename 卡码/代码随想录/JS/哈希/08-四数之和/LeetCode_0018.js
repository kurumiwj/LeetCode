//18. 四数之和
const fourSum = function(nums, target) {
  let res=new Array();
  nums.sort((a,b)=>a-b);
  for(let k=0;k<nums.length-3;k++){
    if(nums[k]>target&&nums[k]>=0) break;
    if(k>0&&nums[k]==nums[k-1]) continue;
    for(let i=k+1;i<nums.length-2;i++){
      if(nums[k]+nums[i]>target&&nums[i]>=0) break;
      if(i>k+1&&nums[i]==nums[i-1]) continue;
      let left=i+1,right=nums.length-1;
      while(left<right){
        let n1=nums[left],n2=nums[right];
        if(nums[k]+nums[i]+n1+n2===target){
          res.push([nums[k],nums[i],n1,n2]);
          while(left<right&&nums[left]===n1) left++;
          while(left<right&&nums[right]===n2) right--;
        }else if(nums[k]+nums[i]+n1+n2<target) left++;
        else right--;
      }
    }
  }
  return res;
};