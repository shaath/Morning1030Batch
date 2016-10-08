package selenium;

public class reverseString 
{

	public static void main(String[] args)
	{
		//QEdge------->egdEQ
		
		String original="QEdge";
		
		int len=original.length();
		
		System.out.println(len);
		
//		for (int i = 0; i < len; i++)
//		{
//			char s=original.charAt(i);
//			System.out.println(s);
//			
//		}
		
		for (int i = len-1; i >= 0; i--) 
		{

			System.out.print(original.charAt(i));
		}

	}

}
