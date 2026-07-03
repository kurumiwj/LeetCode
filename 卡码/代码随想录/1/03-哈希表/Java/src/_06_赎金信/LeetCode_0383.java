//383. 赎金信
package _06_赎金信;

public class LeetCode_0383 {

}
class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
  	if(ransomNote.length()>magazine.length()) return false;
  	int[] hash=new int[26];
  	for(Character ch:magazine.toCharArray())
  		hash[ch-'a']++;
  	for(Character ch:ransomNote.toCharArray()) {
  		hash[ch-'a']--;
  		if(hash[ch-'a']<0) return false;
  	}
  	return true;
  }
}