package selenium;

public class twodimArray 
{
	public static void main(String[] args) 
	{
		Object[][] s=new Object[2][3];
		//rows length 
		System.out.println(s.length);
		//columns length
		
		System.out.println(s[0].length);
		
		//writing the data into array
		
		s[0][1]="Selenium";
		s[1][2]=30000;
		
		
		//read the data from an array
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
			}
			
		}
		
		
	}

}
