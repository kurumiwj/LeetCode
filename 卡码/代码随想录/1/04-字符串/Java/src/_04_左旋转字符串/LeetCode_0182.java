//LCR 182. ¶¯Ì¬¿ÚÁî
package _04_×óĞı×ª×Ö·û´®;

public class LeetCode_0182 {
	
}
class Solution {
  public String dynamicPassword(String password, int target) {
  	StringBuilder builder = new StringBuilder(password);
  	int n=password.length();
  	reverse(builder,0,target-1);
  	reverse(builder,target,n-1);
  	reverse(builder,0,n-1);
  	return builder.toString();
  }
  public static StringBuilder reverse(StringBuilder builder,int start,int end) {
  	while(start<end) {
  		char tmp = builder.charAt(start);
  		builder.setCharAt(start, builder.charAt(end));
  		builder.setCharAt(end,tmp);
  		start++;
  		end--;
  	}
  	return builder;
  }
}