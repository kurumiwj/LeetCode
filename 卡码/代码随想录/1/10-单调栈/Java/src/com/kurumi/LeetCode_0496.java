//496. 下一个更大元素 I
package com.kurumi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LeetCode_0496 {

}
class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
  	Stack<Integer> st=new Stack<>();
  	int[] res=new int[nums1.length];
  	Arrays.fill(res,-1);
  	HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
  	for(int i=0;i<nums1.length;i++) hash.put(nums1[i],i);
  	for(int i=0;i<nums2.length;i++) {
  		while(!st.empty()&&nums2[i]>nums2[st.peek()]) {
  			if(hash.containsKey(nums2[st.peek()])) res[hash.get(nums2[st.peek()])]=nums2[i];
  			st.pop();
  		}
  		st.push(i);
  	}
  	return res;
  }
}