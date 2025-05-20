package functions;

import java.util.*;
public class MethodEx1 {
	public static void printMyName(String name ) {
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your name --> ");
		String name=sc.next();
		
		
		printMyName(name);

	}

}
