//14. ¾ä×ÓËõĞ´
package test14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<n;i++) {
			String[] words = scanner.nextLine().split("\\s+");
			for(String word:words) System.out.print(word.toUpperCase().charAt(0));
			System.out.println();
		}
	}
}
