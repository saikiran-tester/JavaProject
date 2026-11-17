package NewPac;


public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[][] = new int[3][2];
	
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		
	  //  System.out.println(a[2][0]);
	/*	
	    for(int r=0; r<a.length; r++)
	    {
	    	for(int c=0; c<a[r].length;c++)
	    	{
	    		System.out.print( a[r][c]+ " ");
	    	}
	    	
	    	System.out.println();
	    	
	    }
	    */
		
		
		for(int v[]:a)
		{
			for(int x:v)
			{
				System.out.print(x + " ");
			}
			
			System.out.println();
		}
		
		
		
		

	}

}
