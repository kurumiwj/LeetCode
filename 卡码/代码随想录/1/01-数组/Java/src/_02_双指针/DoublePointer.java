//27. ÒÆ³ıÔªËØ
package _02_Ë«Ö¸Õë;

public class DoublePointer {
	public static void main(String[] args) {
		int[] nums=new int[] {0,1,2,2,3,0,4,2};
		Solution solution = new Solution();
		System.out.println(solution.removeElement(nums, 2));
	}
}
class Solution {
  public int removeElement(int[] nums, int val) {
  	int slow=0,fast=0;
  	for(fast=0;fast<nums.length;fast++) {
  		if(nums[fast]!=val) nums[slow++]=nums[fast];
  	}
  	return slow;
  }
}