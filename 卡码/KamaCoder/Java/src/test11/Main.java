//11. 共同祖先
package test11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n=scanner.nextInt();
			int[] commons=new int[21];
			for(int i=0;i<n;i++) {
				int a=scanner.nextInt();
				int b=scanner.nextInt();
				commons[a]=b;
			}
			int height1=0;	//1的高度
			int height2=0;	//2的高度
			int start1=1;
			int start2=2;
			while(commons[start1]!=0) {
				height1++;
				start1=commons[start1];
			}
			while(commons[start2]!=0) {
				height2++;
				start2=commons[start2];
			}
			if(height1>height2) System.out.println("You are my elder");
			else if(height1<height2) System.out.println("You are my younger");
			else System.out.println("You are my brother");
		}
	}
}
