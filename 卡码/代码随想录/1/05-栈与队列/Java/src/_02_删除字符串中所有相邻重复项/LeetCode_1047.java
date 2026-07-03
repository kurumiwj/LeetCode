//1047. 删除字符串中的所有相邻重复项
package _02_删除字符串中所有相邻重复项;

import java.util.Stack;

public class LeetCode_1047 {

}
class Solution {
  public String removeDuplicates(String s) {
  	Stack<Character> stack = new Stack<>();
  	for(int i=0;i<s.length();i++) {
  		if(stack.empty()||s.charAt(i)!=stack.peek()) stack.push(s.charAt(i));
  		else {
  			if(stack.peek()==s.charAt(i)) stack.pop();
  		}
  	}
  	StringBuilder builder = new StringBuilder();
  	while(!stack.empty()) {
  		builder.append(stack.pop());
  	}
  	return new String(builder.reverse());
  }
}