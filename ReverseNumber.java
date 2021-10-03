import java.util.Scanner;
public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int reverse=0;
		
		System.out.println("Enter number to reverse it");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		while (n>0) {
		int num1=n%10;
		reverse=reverse*10+num1;
		n=n/10;
		
		}
	System.out.println(reverse);
	}
}
