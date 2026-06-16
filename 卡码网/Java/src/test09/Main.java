//9. Ææ¹ÖµÄÐÅ
package test09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] nums = scanner.next().split("");
			int res=0;
			for (String num : nums) {
				int tmp=Integer.parseInt(num);
				if(tmp%2==0) {
					res+=tmp;
				}
			}
			System.out.println(res);
			System.out.println();
		}
	}
}
