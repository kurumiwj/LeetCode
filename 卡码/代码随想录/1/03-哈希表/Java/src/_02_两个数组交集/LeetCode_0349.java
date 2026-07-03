//349. 两个数组的交集
package _02_两个数组交集;

import java.util.HashSet;

public class LeetCode_0349 {

}
class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
  	HashSet<Integer> hash = new HashSet<Integer>();
  	HashSet<Integer> res = new HashSet<Integer>();
  	for(int num:nums1) hash.add(num);
  	for(int num:nums2)
  		if(hash.contains(num)) res.add(num);
  	return res.stream().mapToInt(num->num).toArray();
  }
}
