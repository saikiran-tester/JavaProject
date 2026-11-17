package NewPac;

public class SumOfDigits {

	public static void main(String[] args) {
     //input : 1234
		//sum=10	
		
		int value = 1234;
		
		int NewValue = 0;
		
		
		while(value>0)
		{
			int num = value%10;
			
			NewValue = NewValue+num;
			
		    value = value/10;
			
		}
		System.out.println(NewValue);
 
	}

}
