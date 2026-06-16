//10. 运营商活动
package test10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int m=scanner.nextInt();
			int k=scanner.nextInt();
			if(m==0&&k==0) break;
			int total=m;
			while(m>=k) {
				int left=m/k;
				total+=left;
				m=left+m%k;
			}
			System.out.println(total);
		}
	}
}
