package practice_Arrays;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Password");
		String str = scan.nextLine();
		char []ch = str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if (ch.length>=8) {
				count=1;				
				if(ch[i]>='0' && ch[i]<='9')
				{
				count1=1;
				}							
				if(!(ch[i]>='A'&& ch[i]<='Z' || ch[i]>='a'&&ch[i]<='z' || ch[i]>='0' && ch[i]<='9') && ch[i]!=' ') {
				count2=1;
				}
				if(ch[0]>='A' && ch[0]<='Z')
				{
				count3=1;
				}
				
			}
		}
		if (count==0) {
			System.out.println("Password should be of min 8 characters");
		}
		else if (count1==0) {
			System.out.println("Password should contain atleast 1 digit");
		}
		else if (count2==0) {
			System.out.println("Password should contain atleast 1 special character");
		}
		else if (count3==0) {
			System.out.println("Password should start with upper case letter");
		}
		else if (count4==0) {
			System.out.println("Password should not contain space as special character");
		}
	}
}