package NewPac;


public class MissingNum {



	public static void main(String[] args) {
	//a={1,4,5,3}
		//* numbers should be in range
		//* should not have duplicates
		
		int a[]={1,4,5,3};
		boolean found = false;
		
		int i;
		
		
		for( i=1; i<=5;i++)
			
		{
			found = false;
			
			
			for(int s=0; s<a.length;s++)
			{
				if(a[s]==i)
				{
					found=true;
				  
				}
				
			}
			  if(found==false)
			  {
			
			
				System.out.println("Missing Value:"+ i);
				
			  }
			
			
		}
		
		
		
		

	}

}
