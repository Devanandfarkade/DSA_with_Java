package functions;

import java.util.Scanner;

public class NumberOperations {

	public static int sumOfTwoNumbers(int num1, int num2 ) {
		int sum=num1+num2;
		return sum;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first Value --> ");
		int val1=sc.nextInt();
		System.out.print("Enter second Value --> ");
		int val2=sc.nextInt();
		
		int sum=sumOfTwoNumbers(val1, val2);
		System.out.print(" the sum of two numbers are = > " + sum);
		

	}

}
