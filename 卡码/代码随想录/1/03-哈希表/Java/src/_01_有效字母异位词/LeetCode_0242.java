//242. 有效的字母异位词
package _01_有效字母异位词;

import java.util.Arrays;

public class LeetCode_0242 {
	
}
class Solution {
  public boolean isAnagram(String s, String t) {
  	int[] hash=new int[26];
  	for(int i=0;i<s.length();i++) hash[s.charAt(i)-'a']++;
  	for(int i=0;i<t.length();i++) hash[t.charAt(i)-'a']--;
  	for(int i:hash)
  		if(i!=0) return false;
  	return true;
  }
}