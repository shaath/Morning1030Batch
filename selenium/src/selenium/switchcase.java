package selenium;

public class switchcase 
{
	public static void main(String[] args) 
	{
		String course="selenium";
		
		switch (course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Qtp":
			System.out.println("You are selected Qtp");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "LoadRunner":
			System.out.println("You are selected Loadrunner");
			break;
		default:
			System.out.println("Select a proper option");
			break;
		}
		
	}

}
