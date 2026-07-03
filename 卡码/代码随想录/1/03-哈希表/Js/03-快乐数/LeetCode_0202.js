//202. 快乐数
const getSum=n=>{
  let sum=0;
  while(n>0){
    sum+=(n%10)*(n%10);
    n=Math.floor(n/10);
  }
  return sum;
}
const isHappy=n=>{
  let set=new Set();
  while(n!=1&&!set.has(n)){
    console.log(set);
    set.add(n);
    n=getSum(n);
  }
  return n==1;
}