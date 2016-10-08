package selenium;

public class staticArray
{
	public static void main(String[] args)
	{
//		int[] sal={30000,40000,50000,60000,70000};
		
		Object[] course={2222,2.2222,'M',false, "Selenium","QTP","LoadRunner","Manual"};
		//length of the array
		
		int len=course.length;
		System.out.println(len);
		
		//reading the values from array
		
//		System.out.println(sal[3]);
		
		for (int i = 0; i < course.length; i++) 
		{
			System.out.println(course[i]);
		}
		
	}
}
