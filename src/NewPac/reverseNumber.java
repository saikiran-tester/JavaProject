package NewPac;

public class reverseNumber {

	public static void main(String[] args) {
		//input = 1234 ( % / = operators )
		
		int value = 24536;
		
		int revValue=0;
		
		while(value>0)
		{
			int digit = value%10;
			
			revValue = revValue*10+digit;
			value=value/10;
		}
		
		System.out.println(revValue);
		
		
		

	}

}
