//16. Œª÷√ª•ªª
package test16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			String str = scanner.next();
			System.out.println(reverse(str));
		}
	}
	public static String reverse(String str) {
		String res="";
		for(int i=0;i<str.length();i+=2) {
			res+=str.substring(i+1,i+2)+str.substring(i,i+1);
		}
		return res;
	}
}
