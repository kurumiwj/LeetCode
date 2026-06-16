//7. 平均绩点
package test07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String scores="FDCBA";
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] grades = scanner.nextLine().split(" ");
			double total=0;
			boolean flag=false;	//标记是否有奇怪的字母混入
			for(String grade:grades) {
				int index=scores.indexOf(grade);
				if(index!=-1) total+=index;
				else {
					flag=true;
					break;
				}
			}
			if(!flag) System.out.printf("%.2f\n",total/grades.length);
			else System.out.println("Unknown");
		}
	}
}
