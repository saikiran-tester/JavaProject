package NewPac;

public class Ploymorphism {

	void entry(String a, String b)
	{
		String Person1 = a;
		
		String Person2= b;
		
		System.out.println(a+" "+"and"+" "+b+" "+ "Made for eachother");
	
		
		
	}
	
	void entry(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void entry()
	{
		int a = 14;
		double b = 18;
		
		System.out.println(a/b);
	}
	
	
	
	
	public static void main(String[] args) {
		Ploymorphism pol = new Ploymorphism();
		pol.entry();
	    pol.entry(14, 18);
	    pol.entry("saikiran", "Vaishnavi");

	}

}
