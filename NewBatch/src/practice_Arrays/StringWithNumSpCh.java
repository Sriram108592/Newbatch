package practice_Arrays;

public class StringWithNumSpCh {
public static void main(String[] args) {
	String s = "@123ABC456$";
	String alpha = "";
	String num ="";
	String sp = "";
	for (int i=0; i<s.length();i++)
	{
		if (s.charAt(i)>='A' && s.charAt(i)<='z')
		{
			alpha = alpha + s.charAt(i);
		}
		else if (s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			num = num + s.charAt(i);
		}
		else
		{
			sp = sp + s.charAt(i);
		}		
	}	
	System.out.println(num);
	System.out.println(sp);
	System.out.println(alpha);
}
}
