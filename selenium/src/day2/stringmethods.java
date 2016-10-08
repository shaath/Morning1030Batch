package day2;

public class stringmethods 
{
	public static void main(String[] args) 
	{
		String Original="QEdge";
		
//		System.out.println(Original.substring(2, 5));
//		System.out.println(Original.charAt(4));
		int len=Original.length();
		System.out.println(len);
		
		for (int i = len-1; i >= 0; i--)
		{
			
			System.out.print(Original.charAt(i));
		}
		
		
	}

}
