//704. 二分查找
package _01_二分;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums=new int[] {-1,0,3,5,9,12};
		Solution solution = new Solution();
		System.out.println(solution.search(nums, 9));
		System.out.println(solution.search(nums, 2));
		System.out.println(solution.search(nums, 13));
	}
}
class Solution {
  public int search(int[] nums, int target) {
  	int left=0,right=nums.length-1;
  	while(left<=right) {
  		int middle=(left+right)/2;
  		if(nums[middle]==target) return middle;
  		else if(target<nums[middle]) right=middle-1;
  		else left=middle+1;
  	}
  	return -1;
  }
}