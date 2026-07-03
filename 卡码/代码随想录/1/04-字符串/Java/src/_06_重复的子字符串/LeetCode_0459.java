//459. 重复的子字符串
package _06_重复的子字符串;

public class LeetCode_0459 {

}
class Solution {
  public boolean repeatedSubstringPattern(String s) {
  	int n=s.length();
  	//法一
//  	String s1=(s+s).substring(1,2*n-1);
//  	return s1.contains(s);
  	//法二
  	int[] next=new int[n];
  	int j=0;
  	next[0]=0;
  	for(int i=1;i<s.length();i++) {
  		while(j>0&&s.charAt(j)!=s.charAt(i)) j=next[j-1];
  		if(s.charAt(j)==s.charAt(i)) j++;
  		next[i]=j;
  	}
  	return next[n-1]!=0&&n%(n-next[n-1])==0;	//最长相等前后缀不等于0且剩下的元素能被字符串长度整除则一定有重复子串构成
  }
}