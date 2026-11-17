package NewPac;

public class SumArray {

	public static void main(String[] args) {
		// a={1,2,3,4,5}
		//sum=15
		
		int sum=0;
		
		int a[] = {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("sum of element array :"+" "+ sum);

	}

}
