package logical.program;
import java.util.Scanner;
public class FebonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N to get febanacci series ");
		int N= sc.nextInt();
		int num1=0;
		int num2=1;
		for(int i = 0; i < N; i++) {
			int sum = num1 + num2;     //getting sum of previous two numbers
			System.out.print(sum);
			System.out.print(" ");
			num2 = num1;               //assigning previous number to next number 
			num1 = sum; 			   //assigning sum to previous number
			}
		}
	}
