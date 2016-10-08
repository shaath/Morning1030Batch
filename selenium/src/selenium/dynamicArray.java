package selenium;

public class dynamicArray {

	public static void main(String[] args) 
	{
		
		int[] sal=new int[5];
		
		System.out.println(sal.length);
		
		//write the data into array
		
		sal[1]=40000;
		sal[4]=50000;
		sal[0]=80000;
		System.out.println(sal.length);
		
//		read the data from arrat
		
		for (int i = 0; i < sal.length; i++) 
		{
			System.out.println(sal[i]);
			
		}

	}

}
