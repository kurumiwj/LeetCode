//12. 打印数字图形
package test12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n=scanner.nextInt();
			for(int i=1;i<=n;i++) {
				printSpace(n-i);
				printLine(i);
			}
			for(int i=n-1;i>=1;i--) {
				printSpace(n-i);
				printLine(i);
			}
		}
	}
	//打印一行
	public static void printLine(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i);
		}
		for(int i=n-1;i>=1;i--) System.out.print(i);
		System.out.println();
	}
	//打印空白
	public static void printSpace(int n) {
		for(int i=0;i<n;i++) System.out.print(" ");
	}
}
