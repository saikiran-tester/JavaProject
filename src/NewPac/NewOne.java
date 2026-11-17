package NewPac;


interface I1
{
	
	int a = 14;
	
	void appa();//abstract method
	
	default void Mylove()
	{
		System.out.println("I love my son and wife");
	}
	
}

interface I2
{
	int b = 18;
	
	void Mom();//abstract method
	
	default void Myloveto()
	{
		System.out.println("I love my son and Husband");
	}
	
}


public class NewOne implements I1, I2 
{
	
	public void appa()
	{
		System.out.println("My dad birthday date:"+a);
	}
	
	public void Mom()
	{
		System.out.println("My Mom birthday date:"+b);
	}
	
	void lov()
	{
		System.out.println("pet");
	}
	
	

	public static void main(String[] args) {
		NewOne l = new NewOne();
		
		l.appa();
		l.Mom();
		l.Mylove();
		l.lov();
		l.Myloveto();
		
		
		
		I1 l2 = new NewOne();
		l2.Mylove();
		
		
		
		
		

	}




}
