package NewPac;

public class Constructor {
	
	
	Constructor(String a, String b)
	{
		String Person1 = a;
		
		String Person2= b;
		
		System.out.println(a+" "+"and"+" "+b+" "+ "Made for eachother");
	
		
		
	}
	
	Constructor(int a, int b)
	{
		System.out.println(a+b);
	}
	
	Constructor()
	{
		int a = 14;
		double b = 18;
		
		System.out.println(a/b);
	}
	
	
	
	
	public static void main(String[] args) {
		Constructor  cos =  new Constructor("saikiran", "Vaishnavi");
		Constructor  cos1 =  new Constructor(14,18);
		Constructor  cos2 =  new Constructor();


	}

}
