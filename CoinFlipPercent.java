import java.util.Scanner;

	public class CoinFlipPercent {
		
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of times coin to be fliped"); 
		double flip= sc.nextInt();

		if(flip<=0) {
			System.out.println("Enter number greater than zero");
			return;
		}
		double flipCoin=flip;     
		
		//delcared counters to store head and tail count
		
		int headsCounter=0; 		
						
		int tailsCounter=0;
		
		while(flipCoin>0) {
			double random=Math.random();        //getting ramdom value between 0 and 1
			if(random<0.5) {
				tailsCounter++;
				
			}
			else {
				headsCounter++;
				
			}
			flipCoin--;
		}
		//calculating head and tail percentage

		double headsPercent=(headsCounter/flip)*100;      
		double tailsPercent=(tailsCounter/flip)*100;
		
		System.out.println("Percentage of heads is "+headsPercent);
		System.out.println("Percentage of tails is "+tailsPercent);
		
	
		}

    }

