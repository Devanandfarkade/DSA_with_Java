package patterns;

public class Diamond {

	public static void main(String[] args) {
		int n=5;
		//upper half 
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//Stars 			
			for(int j=1;j<=2*i-1;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Lower half
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//Stars 			
			for(int j=1;j<=2*i-1;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
