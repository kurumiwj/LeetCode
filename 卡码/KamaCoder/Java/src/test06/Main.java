//6. A+BŒ Ã‚VIII
package test06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n=scanner.nextInt();
			for(int i=0;i<n;i++) {
				int sum=0;
				int m=scanner.nextInt();
				for(int j=0;j<m;j++) {
					sum+=scanner.nextInt();
				}
				System.out.println(sum);
				if(i!=n-1) System.out.println();
			}
		}
	}
}
