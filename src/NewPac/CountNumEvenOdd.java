package NewPac;

public class CountNumEvenOdd {

	public static void main(String[] args) {
		//Input: 23456
		//Output : 3 even 2 odd
		
		int value = 23456;
		
		while(value>0)
		{
			int num = value%10;
			
			if(num%2==0)
			{
				System.out.println(num + "Even");
			}
			
			else
			{
				System.out.println(num + "Odd");
			}
			
			value = value/10;
		}

	}

}
