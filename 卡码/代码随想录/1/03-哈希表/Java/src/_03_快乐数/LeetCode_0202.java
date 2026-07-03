//202. 快乐数
package _03_快乐数;

import java.util.HashSet;

public class LeetCode_0202 {
	
}
class Solution {
  public boolean isHappy(int n) {
  	HashSet<Integer> set = new HashSet<Integer>();
  	//如果n不为1且set中不包含n
  	while(n!=1&&!set.contains(n)) {
  		set.add(n);
  		n=getSum(n);
  	}
  	return n==1;
  }
  public int getSum(int n) {
  	int sum=0;
  	while(n>0) {
  		sum+=(n%10)*(n%10);
  		n/=10;
  	}
  	return sum;
  }
}