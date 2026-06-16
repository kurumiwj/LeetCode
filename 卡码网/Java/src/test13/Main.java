//13. ïÎ¿ÕÈý½ÇÐÎ
package test13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String x=scanner.next();
			if("@".equals(x)) break;
			int n=scanner.nextInt();
			for(int i=1;i<=n;i++) {
				printSpace(n-i);
				if(i==1||i==n)
					for(int j=1;j<=2*i-1;j++) System.out.print(x);
				else printLine(x, 2*i-1);
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void printLine(String x,int n) {
		System.out.print(x);
		for(int i=0;i<n-2;i++) System.out.print(" ");
		System.out.print(x);
	}
	public static void printSpace(int n) {
		for(int i=0;i<n;i++) System.out.print(" ");
	}
}
