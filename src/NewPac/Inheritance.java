package NewPac;
class A
{
	
	int a;
	
	void m1()
	{
		System.out.println(a);
	}
}


class B extends A
{
    int b;
	
	void m2()
	{
		System.out.println(b);
	}
}


class C extends B
{
    int c;
	
	void m3()
	{
		System.out.println(c);
	}
}
public class Inheritance {


	public static void main(String[] args) {
		
      B ch = new B();
		
      ch.a=14;
      ch.m1();
      ch.b=18;
      ch.m2();
      ch.c=16;
      ch.m3();
      
		
	}

}
