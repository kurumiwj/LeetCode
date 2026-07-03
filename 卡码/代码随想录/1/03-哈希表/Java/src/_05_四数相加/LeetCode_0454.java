//454. 四数相加 II
package _05_四数相加;

import java.util.HashMap;

public class LeetCode_0454 {

}
class Solution {
  public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
  	HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
  	for(int num1:nums1)
  		for(int num2:nums2) {
  			int target=num1+num2;
  			if(map.containsKey(target))
  				map.put(target,map.get(target)+1);
  			else
					map.put(target,1);
  		}
  	int sum=0;
  	for(int num3:nums3)
  		for(int num4:nums4)
  			if(map.containsKey(-(num3+num4))) sum+=map.get(-(num3+num4));
  	return sum;
  }
}