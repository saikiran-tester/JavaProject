package NewPac;

public class Palindromenumber {

	public static void main(String[] args) {
		//input 121
		//after reversing 121
		
		int value = 121;
		
		int OriginalValue = value;
		
		int reValue = 0;
		
		while(value>0)
		
		{
			
		  int digit  = value%10;
		  
		   reValue = reValue*10+digit;
	
			value=value/10;
		}
		
		System.out.println(reValue);
		
		if(reValue==OriginalValue)
		{
		
		System.out.println("Its Palindrome");
		
		}
		
		else
		{
			System.out.println("Its not Palindrome");
		}
			
		
	}

}
