//LCR 182. 动态口令
const dynamicPassword = function(password, target) {
  let n=password.length;
  let arr=Array.from(password);
  reverse(arr,0,target-1);
  reverse(arr,target,n-1);
  reverse(arr,0,n-1);
  return arr.join("");
};
const reverse=function(str,start,end){
  while(start<end){
    [str[start],str[end]]=[str[end],str[start]];
    start++;
    end--;
  }
}