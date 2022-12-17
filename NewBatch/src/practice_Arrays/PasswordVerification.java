package practice_Arrays;

import java.util.Scanner;

public class PasswordVerification {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the password");
		String pwd = s.nextLine();
		char[] ch =pwd.toCharArray();
		int countDigit=0;
		int countSpChar=0;
		if(ch.length<8)
			System.out.println("Password should contain atleast 8 characters");
		if(pwd.contains(" "))
			System.out.println("Password should not contain Space");
		if(!(ch[0]>='A' && ch[0]<='Z'))
			System.out.println("Password should start with capital letter");
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9')
			{
			countDigit++;
			}	
			if(!(ch[i]>='A'&& ch[i]<='Z' || ch[i]>='a'&&ch[i]<='z' || ch[i]>='0' && ch[i]<='9'))
			{
			countSpChar++;
			}
		}
		if (countDigit==0)
			System.out.println("Password should contain atlest one digit");
		if (countSpChar==0)
			System.out.println("Password should contain atlest special character");
	}
}
