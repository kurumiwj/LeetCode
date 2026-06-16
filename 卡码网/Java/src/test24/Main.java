//24. 最长公共子序列
package test24;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str1 = scanner.next();
			String str2 = scanner.next();
			int[][] dp=new int[str1.length()+1][str2.length()+1];
			for(int i=1;i<=str1.length();i++) {
				for(int j=1;j<=str2.length();j++) {
					if(str1.charAt(i-1)==str2.charAt(j-1)) {
						dp[i][j]=dp[i-1][j-1]+1;
					}else {
						dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
					}
				}
			}
			System.out.println(dp[str1.length()][str2.length()]);
		}
	}
}
