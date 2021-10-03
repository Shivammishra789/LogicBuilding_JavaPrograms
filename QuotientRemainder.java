import java.util.Scanner;

public class QuotientRemainder {
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter divident ");  
		int divident= sc.nextInt();                 //Taking divident value
		
		System.out.println("enter divisor ");
		int divisor= sc.nextInt();                 //Taking divisor value
		
		int quotient=divident/divisor;
		int remainder=divident%divisor;
		
		System.out.println("Quotient is "+quotient);
		System.out.println("Remainder is "+remainder);
		
	
	}

}

