package NewPac;

public class CountNumber {

	public static void main(String[] args) {
		// Input : 423424
		//output : 6
		
		int value = 423424;
		
		int count = 0;
		
		while(value>0)
		{
			
			count=count+1;
			
			value=value/10;
		}
		
		System.out.println("Count"+ count);

	}

}
