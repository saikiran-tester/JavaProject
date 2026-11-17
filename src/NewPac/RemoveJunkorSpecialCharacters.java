package NewPac;

public class RemoveJunkorSpecialCharacters {

	public static void main(String[] args) {
		String s = "Hello@123#World!";
		
		//String res = s.replace("@", "").replace("#", "").replace("!", "");
		
		String res = s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(res);
		
		//remove spacess
		
		String sl = "Java Selenium Testing";
		String resu = sl.replaceAll("\\s","");
		System.out.println(resu);
		
		
		//count charactes;
		/*
		String rep = "abcbccccbbbaaaaccc";
		char ch = 'c';
		int count=0;
		
		for(int i=0; i<rep.length()-1;i++)
		{
			char r = rep.charAt(i);
			
			if(r==ch)
			{
				count++;
			}
			
		}
		
		
		System.out.println("Count of c :"+ count);
		
		*/
		
		
		String w = "Java Selenium Testing";
		
	    String res1[] = w.split(" "); 
		
	    System.out.println(res1.length);
		
		
		
		
		

	}

}
