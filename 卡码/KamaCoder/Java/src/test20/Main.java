//20. É¾³ıÖØ¸´ÔªËØ
package test20;

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
				nums[i]=scanner.nextInt();
				if(i!=0) System.out.print(" ");
				System.out.print(nums[i]);
			}
			System.out.println();
			int pre=nums[0];
			System.out.print(pre);
			for(int i=1;i<n;i++) {
				if(nums[i]!=pre) {
					System.out.print(" "+nums[i]);
					pre=nums[i];
				}
			}
			System.out.println();
		}
	}
}
