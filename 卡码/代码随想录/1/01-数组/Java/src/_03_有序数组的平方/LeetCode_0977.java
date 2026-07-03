//977. 有序数组的平方
package _03_有序数组的平方;

import java.util.Arrays;

public class LeetCode_0977 {
	public static void main(String[] args) {
		Solution0977 solution0977 = new Solution0977();
		System.out.println(Arrays.toString(solution0977.sortedSquares(new int[] {-4,-1,0,3,10})));
	}
}
class Solution0977 {
  public int[] sortedSquares(int[] nums) {
  	int[] res=new int[nums.length];
  	int k=nums.length-1;
  	for(int i=0,j=nums.length-1;i<=j;) {
  		if(Math.pow(nums[i],2)>Math.pow(nums[j],2)) {
  			res[k--]=(int)Math.pow(nums[i++],2);
  		}else {
  			res[k--]=(int)Math.pow(nums[j--],2);
  		}
  	}
  	return res;
  }
}