package loops;
import java.util.*;
public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.print("Enter 1 for input marks of 0 for Stop ");
			choice=sc.nextInt();
		if(choice==1) {
			System.out.print("Enter The marks --> ");
			int marks=sc.nextInt();
			if(90<=marks && marks <= 100) 
				System.out.println("this is Good");
			else if(marks<=89 && 60<=marks) 
				System.out.println("This is also Good");
			else if(marks<=59 && 0<=marks) {
				System.out.println("This is Good as well");
				System.out.println("Because marks don’t matter but our effort does.");
			}
			else {
				System.out.println("This is invalid marks please Enter marks Between 0 to 100 Only ");
			}
		}

		}
		while(choice!=0);
		System.out.println("PRogram end");
		sc.close();
	}

}
