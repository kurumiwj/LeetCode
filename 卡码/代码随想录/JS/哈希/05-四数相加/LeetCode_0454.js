//454. 四数相加 II
const fourSumCount=(nums1,nums2,nums3,nums4)=>{
  let map=new Map();
  let sum=0;
  nums1.forEach(num1=>{
    nums2.forEach(num2=>{
      let target=num1+num2;
      map.set(target,(map.get(target)||0)+1);
    });
  });
  nums3.forEach(num3=>{
    nums4.forEach(num4=>{
      let target=-(num3+num4);
      sum+=map.get(target)||0;
    });
  });
  return sum;
}