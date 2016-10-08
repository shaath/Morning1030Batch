package functions;

public class orgTestSuite {

	public static void main(String[] args) 
	{
		//LoginTc
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//Empreg TC
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Empreg("Madhu", "Chandra");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//Userreg TC
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		
		res=om.org_Userreg("Madhu Chandra", "MadhuChandra1234", "MadhuChandra1234", "MadhuChandra1234");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//UserLogin Tc
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("MadhuChandra1234", "MadhuChandra1234");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();


	}

}
