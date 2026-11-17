package NewPac;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(100);
		l.add(15.0);
		l.add("sai");
		l.add(true);
		l.add(null);
		l.add('V');
		
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		l.remove(5);
		System.out.println(l);

		
		for(int  i=0; i<l.size()-1;i++ )
		{
			System.out.println(l.get(i));
		}
		
		
		
		Iterator il = l.iterator();
		
		
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
		
		
		
	}

}
