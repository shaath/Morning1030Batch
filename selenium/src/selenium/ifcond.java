package selenium;

import java.util.Scanner;

public class ifcond {

	public static void main(String[] args) 
	{
//		int a=300;
//		int b=400;
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (a > b)
		{
			System.out.println("A is Greater");
		}
		else
		{
			System.out.println("B is greater");
		}

	}

}
