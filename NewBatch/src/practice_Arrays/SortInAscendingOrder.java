package practice_Arrays;
//sort all the elements in ascending order
public class SortInAscendingOrder {

	public static void main(String[] args) {
		int a[]= {30,20,10,50,40};
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i]>a[j])// condition for ascending Order
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
