package practice_Arrays;

public class MaxLengthOfStringIn_Array {
public static void main(String[] args) {
	String S[] = {"raja","bye", "who", "hi","to", "amma"};
	String max = S[0];
	for ( int i=1; i < S.length; i++)
	{
		if (max.length()< S[i].length())
		{
			max = S[i];
		}
	}
	for (int i=0; i<S.length; i++ )
	{
		if (max.length()==S[i].length()) {
			System.out.println(S[i]);
		}
	}
		
	//System.out.println("Maximum Length of the string in the given Array: " + max );
	
}
}
