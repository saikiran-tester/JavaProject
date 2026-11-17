package NewPac;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// 1) Sorting elements using for loop
		//a={50,20,40,10,100}
		//after sorting 10 20 40 50 100
		
		int a[]= {50,20,40,10,100};
		
		System.out.println("Before sorting:" + Arrays.toString(a));
		
		//Arrays.sort(a);
		
		//System.out.println("After sorting:" + Arrays.toString(a)); //20 50 40
		
		for (int i=0; i<a.length-1;i++)
		{
			for(int s=0; s<a.length-1-i; s++)
			{
				if(a[s]>a[s+1])
				{
					int tnum= a[s];
					
					a[s]=a[s+1];//20
					a[s+1]=tnum;//50
					
				}
			}
		}
		
		
		System.out.println("After sorting:" + Arrays.toString(a));
		
	}

}
