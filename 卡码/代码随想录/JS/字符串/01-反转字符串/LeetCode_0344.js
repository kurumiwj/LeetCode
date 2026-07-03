//344. 反转字符串
const reverseString = function(s) {
  let left=-1,right=s.length;
  while(++left<--right) [s[left],s[right]]=[s[right],s[left]];
};