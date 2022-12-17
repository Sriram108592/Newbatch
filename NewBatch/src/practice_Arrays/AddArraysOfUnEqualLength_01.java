// Assignment 
//int a[] = {1,2,0,0,4,0,5,0,6}
//o/p int a[] = { 1,2,4,5,6,0,0,0,0}
package practice_Arrays;

public class AddArraysOfUnEqualLength_01 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		int [] b= {4,5,6,4,8,9};
		int count = a.length;
		if (count<b.length)
		{
			count = b.length;
		}
		for ( int i =0; i<count; i++)
		{
			{
				try {
					System.out.println(a[i]+b[i]);
				}
				catch (Exception e) {
					if (a.length>b.length) {//<
						System.out.println(a[i]);//b
					}else {
						System.out.println(b[i]);//a
					}
					
					
				}
			}

		}
	}

}
