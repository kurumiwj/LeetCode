//42. ½ÓÓêË®
package com.kurumi;

import java.util.LinkedList;
import java.util.Stack;

public class LeetCode_0042 {

}
class Solution {
  public int trap(int[] height) {
  	int res=0;
  	LinkedList<Integer> st=new LinkedList();
  	for(int i=0;i<height.length;i++) {
  		while(!st.isEmpty()&&height[i]>height[st.peek()]) {
  			int mid=st.pop();
  			if(!st.isEmpty()) {
  				int h=Math.min(height[i],height[st.peek()])-height[mid];
  				int w=i-st.peek()-1;
  				res+=h*w;
  			}
  		}
  		st.push(i);
  	}
  	return res;
  }
}