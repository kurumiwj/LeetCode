//17. 出栈合法性
package test17;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n=scanner.nextInt();
			if(n==0) break;
			int[] nums=new int[n];
			for(int i=0;i<n;i++) {
				nums[i]=scanner.nextInt();
			}
			Stack<Integer> stack = new Stack<Integer>();
			int index=0;
			for(int i=1;i<=n;i++) {
				stack.push(i);
				while(!stack.empty()&&stack.peek()==nums[index]) {
					stack.pop();
					index++;
				}
			}
			if(stack.empty()&&index==n) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
