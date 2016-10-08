package functions;

public class basicFunctions 
{
	public static void main(String[] args) 
	{
		function1();
		
		String res=function2();
		System.out.println(res);
		
		basicFunctions f=new basicFunctions();
		
		f.function3();
		
		res=f.function4();
		System.out.println(res);
	}
	
	//static function without returning
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//static function with returning a value
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	//non static function without returning value
	
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	
	// non static function with returning value
	
	public String function4()
	{
		System.out.println("This is Function4 code");
		return "Fail";
	}

}
