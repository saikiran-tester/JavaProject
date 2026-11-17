package NewPac;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//1) Arithmetic operators + - * / %
		
		int a =14 , b = 18;
		
		System.out.println("Sum of a+b:"+(a+b));
		System.out.println("Sum of a-b:"+(a-b));
		System.out.println("Sum of a*b:"+(a*b));
		System.out.println("Sum of a/b:"+(a/b));
		System.out.println("Sum of a%b:"+(a%b));
		
		//2) Relational/comparison operators > >= < <= != ==
		//return boolean value
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
		//3) Logical operators && || !
		//return boolean value
		
		boolean x = true , y = false;
		

		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		
		//4) Increment & Decrement operators ++ --
		
		//increment operator
		int c = 10;
		
		//c++;
		
		System.out.println(c);
		
		 // post increment
		c = 14;
		int res=c++;
		System.out.println(res);
		System.out.println(c);
		//pre increment
		int d = 14;
		int res2=++d;
		System.out.println(res2);
		System.out.println(c);
		
		//decrement operator
		
		int e = 10;
		
		e--;
		
		System.out.println(e);
		
		 // post increment
		int f = 14;
		int res3=f--;
		System.out.println(res3);
		System.out.println(f);
		//pre increment
		int g = 14;
		int res4=--g;
		System.out.println(res4);
		System.out.println(g);
		

		
		//5) Assignment = += -= *= /= %=
		
		int s = 14;
		
		s+=18; //s=s+18 //32
		
		System.out.println(s);
		
        s-=18; //s=s-18 
		
		System.out.println(s);
		
        s*=18; //s=s*8 
		
		System.out.println(s);
		
       s/=18; //s=s/8 
		
		System.out.println(s);
		
		
        s%=18; //s=s%8 
		
		System.out.println(s);
		
		//6) conditional/ternary operator ?:
		
		int age = 15;
		
		String  Vote = (age>=18)? "eligible" : " Not Eligible";
		
		System.out.println(Vote);
		
		
   	
		
		
		

	}

}
