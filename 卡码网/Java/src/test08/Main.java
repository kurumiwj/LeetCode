//8. °ÚÆ½»ýÄ¾
package test08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			if(n==0) break;
			int[] nums=new int[n];
			int total=0;
			for(int i=0;i<n;i++) {
				nums[i]=scanner.nextInt();
				total+=nums[i];
			}
			int avg=total/n;
			int res=0;
			for(int i=0;i<n;i++) {
				res+=Math.abs(nums[i]-avg);
			}
			System.out.println(res/2);
			System.out.println();
		}
	}
}
