package practice_Arrays;
//sort all the elements in descending order
public class SortInDescendingOrder {

	public static void main(String[] args) {
		int a[]= {4,7,1,2,0,8,5,3,6,9};
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i]<a[j])//condition for descending order 
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");			
			
		}
		
	}
}