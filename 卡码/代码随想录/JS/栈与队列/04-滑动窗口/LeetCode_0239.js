//239. 滑动窗口最大值
class List{
  queue;
  constructor(){
    this.queue=[];
  }
  empty(){
    return this.queue.length===0;
  }
  front(){
    return this.queue[0];
  }
  back(){
    return this.queue[this.queue.length-1];
  }
  push(value){
    while(!this.empty()&&value>this.back()) this.queue.pop();
    this.queue.push(value);
  }
  pop(value){
    if(!this.empty()&&value==this.front()) this.queue.shift();
  }
}
const maxSlidingWindow = function(nums, k) {
  const queue=new List();
  const res=new Array();
  for(let i=0;i<k;i++) queue.push(nums[i]);
  res.push(queue.front());
  for(let i=k;i<nums.length;i++){
    queue.pop(nums[i-k]);
    queue.push(nums[i]);
    res.push(queue.front());
  }
  return res;
};