//209. 长度最小的子数组
package _04_长度最小的子数组;

public class LeetCode_0209 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
	}
}
class Solution {
  public int minSubArrayLen(int target, int[] nums) {
  	int i=0,sum=0,res=nums.length+1;
  	for(int j=0;j<nums.length;j++) {
  		sum+=nums[j];
  		while(sum>=target) {
  			//更新res
  			res=Integer.min(res, j-i+1);
  			//减去i位置的数，更新i
  			sum-=nums[i];
  			i++;
  		}
  	}
  	return res==nums.length+1 ? 0 : res;
  }
}
