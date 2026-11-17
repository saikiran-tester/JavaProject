package NewPac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HarshMapDemo {

	

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(12,"Mownika");
		hm.put(14,"Saikiran");
		hm.put(16,"Srimathika");
		hm.put(18,"Vaishnavi");
		
		
		System.out.println(hm.get(12));
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		//System.out.println(hm.entrySet());
		
		
		//for each
		
		for(int s:hm.keySet())
		{
			System.out.println(s + "  " +hm.get(s));
		}
		
		//iterator
		
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		
		System.out.println(hm.entrySet());
		
		System.out.println("its empty?" + hm.isEmpty());
		
		hm.clear();
		
		System.out.println("its empty?" + hm.isEmpty());
		
		hm.put(12, "Mownika");
		hm.put(12, "Sai");

		System.out.println(hm);
		
		System.out.println(hm.containsKey(14));
		System.out.println(hm.containsValue("Saikiran"));

		hm.remove(16);

		System.out.println(hm) ;
		
		
		
		
	}

}
