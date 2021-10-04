package logical.program;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N to check perfect number or not");
		int N= sc.nextInt();
		int sum=0;
		if(N>0) {
			for(int i=1; i<=N/2;i++) {
					if(N%i==0) {
						sum+=i;
					}
			}
			if(sum == N) {                            //compares entered number equal to sum of divisor 
				System.out.println(N+" is perfect number");
			}
			else
				System.out.println(N+" is not a perfect number");
			}
		else
			System.out.println("enter number greater than zero");    //entered value should be greater than zero
		}	
	}

