//28. 找出字符串中第一个匹配项的下标
package _05_KMP;

public class LeetCode_0028 {

}
class Solution {
  public int strStr(String haystack, String needle) {
  	if(needle.length()==0) return 0;
  	int[] next=new int[needle.length()];
  	int j=0;
  	next[j]=0;
  	for(int i=1;i<needle.length();i++) {
  		while(j>0&&needle.charAt(j)!=needle.charAt(i)) j=next[j-1];	//前后缀不相同向前回退
  		if(needle.charAt(i)==needle.charAt(j)) j++;	//找到相同的前后缀
  		next[i]=j;	//将j前缀长度赋给next[i]
  	}
  	j=0;
  	for(int i=0;i<haystack.length();i++) {
  		while(j>0&&haystack.charAt(i)!=needle.charAt(j)) j=next[j-1];	//不匹配，j向前回退
  		if(haystack.charAt(i)==needle.charAt(j)) j++;	//匹配，i和j同时向后移动
  		if(j==needle.length()) return i-needle.length()+1;	//匹配成功
  	}
  	return -1;
  }
}
