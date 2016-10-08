package functions;

public class userLogin {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println(res);
		
		res=om.org_Login("AnkithaGiradkar1234", "AnkithaGiradkar1234");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
