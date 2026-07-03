//151. 反转字符串中的单词
const reverseWords = function(s) {
  let tmp=s.trim().split(/\s+/);
  return tmp.reverse().join(" ");
};
