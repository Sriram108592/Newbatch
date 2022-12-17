package practice_Arrays;

public class SecondSmallestValue {

	public static void main(String[] args) {
		int a[]= {4,7,1,2,0,8,5,3,6,9};
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i]<a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	
		System.out.println("Minimum element in the given array is: "+ a[a.length-2]);
	}
	

	}


