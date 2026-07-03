//347. 前K个高频元素
const topKFrequent = function(nums, k) {
  const m=new Map();
  for(let num of nums) m.set(num,(m.get(num)||0)+1);
  return [...m.entries()].sort((a,b)=>b[1]-a[1]).slice(0,k).map(item=>item[0]);
};