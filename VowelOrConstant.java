import java.util.Scanner;

public class VowelOrConstant {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter alphabet to check vowel or constant ");  
		 char alpha=sc.next().charAt(0);
		
		if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u') {
			
			System.out.println(alpha+" is vowel ");
			
			}
		else {
		
			System.out.println(alpha+" is constant ");
			
			}
	
	
	}

}
