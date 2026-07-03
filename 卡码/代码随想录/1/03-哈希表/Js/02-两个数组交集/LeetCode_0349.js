//349. 两个数组的交集
const intersection=(nums1,nums2)=>{
  let set=new Set(nums1);
  let res=new Set();
  for(let num of nums2)
    set.has(num)&&res.add(num);
  return Array.from(res);
}