package NewPac;

import java.util.Arrays;

public class StringPalindrome {

	public static void main(String[] args) {
		/*String s= "MADAM"
		Output: palindrom
		String s="Welcome"
		output: Not palindrom*/
		
	/*	String s = "Welcome";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(rev==s)
		{
			System.out.println("Its Palindrome");
		}
		
		else
		{
			System.out.println("Its not Palindrome");
		}
			
		System.out.println(rev);
		
		*/
		
		String s= "Welcome";
		
		char[] ar=s.toCharArray();
		char[]rev = new char [ar.length];
		//System.out.println(ar[0]);
		int j = 0;
		for(int i=ar.length-1;i>=0;i--)
		{
			
			
			 rev[j]=ar[i];
			 j++;
			
		}
		
		if (Arrays.equals(ar, rev))
			
		{
			System.out.println("Its Palindrome");
		}
		
		else
		{
			System.out.println("Its not Palindrome");
		}
		System.out.println(Arrays.toString(rev));
		
		
		
		
		
		
		
	

	}

}
