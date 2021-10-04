package logical.program;
import java.util.Scanner;
public class StopWatch {
	public static void main(String[] args) {
		long start=0;
		long stop=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 to start stopwatch");
		int startpt= sc.nextInt();
		if(startpt==1) {                               //stopwatch starts after entering 1
			 start = System.currentTimeMillis();
			 System.out.println("Enter 0 to stop stopwatch");
			 int stoppt= sc.nextInt();
				if(stoppt==0) {                         //stopwatch ends after entering 0
					 stop = System.currentTimeMillis();
				}
				else
					System.out.println("Invalid input");
		}
		else 
			System.out.println("Invalid input");
		
		
		
		long diff = stop - start;                     
		System.out.println("Stopwatch count is "+diff+" milliseconds");  //difference displayed in milliseconds
	}
}
