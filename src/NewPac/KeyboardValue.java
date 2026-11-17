package NewPac;
import java.util.Arrays;
import java.util.Scanner;
public class KeyboardValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		
		System.out.println("You Entered:" + num);*/
		
		int num[]= new int[5];
		
		
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println("Enter a number for index " + i + ":");
			num[i]=sc.nextInt();
		}
		
		
		System.out.println("Array Element ="+ " "+ Arrays.toString(num));
		
		sc.close();
		
		
		
		
		

	}

}
