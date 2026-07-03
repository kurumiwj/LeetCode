package com.kurumi;

import java.util.Stack;

public class LeetCode_0739 {

}
class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
  	int[] res=new int[temperatures.length];
  	Stack<Integer> st=new Stack<>();
  	for(int i=0;i<temperatures.length;i++) {
  		while(!st.empty()&&temperatures[i]>temperatures[st.peek()]) {
  			res[st.peek()]=i-st.peek();
  			st.pop();
  		}
  		st.push(i);
  	}
  	return res;
  }
}