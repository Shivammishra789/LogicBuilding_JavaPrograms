import java.util.Scanner;
public class PrimeNumber {
	
	public static void main(String[] args) {
	
	int checkprime=0;
		
	System.out.println("Enter number to check prime or not");
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	if(n>=0) {
	if(n==0||n==1) {
		System.out.println(n+" is not prime number");
	}
	else {
		for (int i = 2; i <= n/2; i++) {
			int prime=n%i;
				if(prime==0) {
					checkprime++;
					break;}
     			}
	
	if(checkprime==0) {
		System.out.println(n+" is a prime number");
	}
	else
		System.out.println(n+" is not a prime number");
			}
		}
	else
		System.out.println("Enter a positive number");
	}
}
