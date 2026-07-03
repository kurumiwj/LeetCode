//19. 单链表反转
package test19;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n=scanner.nextInt();
			if(n==0) {
				System.out.println("list is empty");
				continue;
			}
			int[] nums=new int[n];
			for(int i=0;i<n;i++) {
				if(i!=0) System.out.print(" ");
				nums[i]=scanner.nextInt();
				System.out.print(nums[i]);
			}
			System.out.println();
			for(int i=n-1;i>=0;i--) {
				System.out.print(nums[i]);
				if(i!=0) System.out.print(" ");
			}
			System.out.println();
		}
	}
}
