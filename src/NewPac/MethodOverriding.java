package NewPac;

class Parent
{
	
	int a;
	
	void m1()
	{
		System.out.println(a);
	}
}


class Child1 extends Parent
{
    int b;
	
	void m1()
	{
		super.m1();
		System.out.println(b);
	}
}


class Child2 extends Parent
{
    int c;
	
	void m1()
	{
		super.m1();
		System.out.println(c);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
	     
         Child1 mo = new Child1();
         mo.a=10;
         mo.m1();
         
         Child2 mi = new Child2();
         mi.a=14;
         mi.c=18;
         mi.m1();
	}

}
