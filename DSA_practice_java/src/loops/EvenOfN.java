package loops;
import java.util.*;

public class EvenOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number - >");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println("even number is = "+i);
			}
		}

	}

}
