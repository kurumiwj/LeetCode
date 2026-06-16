//15. ÉñÃØ×Ö·û
package test15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();	//ÍÌµô»»ĞĞ·û
		for(int i=0;i<n;i++) {
			String first=scanner.nextLine();
			String second=scanner.nextLine();
			System.out.println(merge(first, second));
		}
	}
	public static String merge(String first,String second) {
		int middle=first.length()/2;
		return first.substring(0, middle)+second+first.substring(middle);
	}
}
