package patterns;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {//print row number, row number's times 
				System.out.print(i + " ");
				
			}
			System.out.println();
		}

	}

}
