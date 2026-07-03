//151. 反转字符串中的单词
package _03_反转字符串中的单词;

public class LeetCode_0151 {

}
class Solution {
  public String reverseWords(String s) {
  	StringBuilder builder = removeSpace(s);
  	reverse(builder,0,builder.length()-1);
  	int start=0,end=1,n=builder.length();
  	while(start<n) {
  		while(end<n&&builder.charAt(end)!=' ') end++;
  		reverse(builder,start,end-1);
  		start=end+1;
  		end=start+1;
  	}
  	return new String(builder);
  }
  public void reverse(StringBuilder builder,int start,int end) {
  	while(start<end) {
  		char tmp = builder.charAt(end);
  		builder.setCharAt(end,builder.charAt(start));
  		builder.setCharAt(start,tmp);
  		start++;
  		end--;
  	}
  }
  public StringBuilder removeSpace(String s) {
  	s = s.trim();
  	int start=0,end=s.length()-1;
  	StringBuilder builder = new StringBuilder();
  	while(start<=end) {
  		char c = s.charAt(start);
  		if(c!=' '||builder.charAt(builder.length()-1)!=' ') builder.append(c);
  		start++;
  	}
  	return builder;
  }
}