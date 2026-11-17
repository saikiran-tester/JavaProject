package NewPac;

public class EvenOddNum {

	public static void main(String[] args) {
		// a={1,2,3,4,5,6}

		//even=3
		//odd=3
		
		int a[] = {1,2,3,4,5,6};
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even=" + a[i]);
			}
			
			else
			{
				System.out.println("Odd=" + a[i]);
				
			}
		}
		
	}

}
