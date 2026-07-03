//344. 反转字符串
package _01_反转字符串;

public class LeetCode_0344 {

}
class Solution {
  public void reverseString(char[] s) {
  	int left=0,right=s.length-1;
  	while(left<right) {
  		s[left]^=s[right];
  		s[right]^=s[left];
  		s[left++]^=s[right--];
  	}
  }
}
