package patterns;

import java.util.Scanner;

public class HolloRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of rows -->");
		int row=sc.nextInt();
		System.out.print("Number of colummns -->");
		int col=sc.nextInt();
		for (int i=1;i<=col;i++) {
			for (int j=1;j<=row;j++) {
				if(i==1 || j==1 || i==row || j==col) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
