package selenium;

public class nestedif {

	public static void main(String[] args) 
	{
		int a=3000;
		int b=4000;
		int c=5000;
		
		if (a>b & a>c) 
		{
			System.out.println("A is Greater");
		}
		else if (b>c & b > a) 
		{
			System.out.println("B is greater");
		} 
		else
		{
			System.out.println("C is greater");
		}

	}

}
