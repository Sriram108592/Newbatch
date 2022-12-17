package practice_Arrays;

public class SumOfFirstTwoSmallestValue {
	public static void main(String[] args) {
		int sum = 0;
	int a[]= {4,7,1,2,0,8,5,3,6,9};
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1; j<a.length;j++)
		{
			if (a[i]>a[j])
			{
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		for(int i=0; i<2; i++) {
			sum = sum+a[i];
			System.out.println("The two Smallest Values are:" + a[i]);
		}
		System.out.println("The Sum of the First Two Smallest value is: " + sum);
}
}
