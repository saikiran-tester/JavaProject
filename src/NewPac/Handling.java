package NewPac;

import java.util.Scanner;

public class Handling {

	public static void main(String[] args) {
		
		System.out.println("program start...");
		
		System.out.println("Loading.......");
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter the number");
		int value = sc.nextInt();
		
		try
		{
		
		System.out.println(100/value);
		}
		
		catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
			
		}
	
		
		System.out.println("Finished..!");

	}

}
