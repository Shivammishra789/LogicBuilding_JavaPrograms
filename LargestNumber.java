public class LargestNumber {
	
	public static void main(String[] args) {
	
	int num1=15;
	int num2=56;
	int num3=-79;
	
	int largest=(num1 > num2)?num1:num2;
												//Computing largest value and assigning it to largest
		largest=(largest >num3)?largest:num3;
		
	System.out.println("The largest number amoung three is "+largest);
	}

}

