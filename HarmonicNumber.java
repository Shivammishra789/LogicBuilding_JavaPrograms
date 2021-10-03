import java.util.Scanner;

	public class HarmonicNumber {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter N to get Nth harmonic value ");
			
			int N= sc.nextInt();   
			double harmonic=0;
			
			for(double i=1;i<=N;i++) {
				double x=1/i;
				harmonic+=x;
				
				}
			System.out.print("The harmonic value for "+N+" is "+harmonic);
				
	}

}
