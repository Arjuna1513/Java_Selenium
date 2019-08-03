package selenium;

public class Path 
{
	public static void main(String[] args) 
	{
		//First get the Home directory of current user.
		String hDir = System.getProperty("user.dir");
		System.out.println(hDir);
		String path = "hDir"+"\\rsc\\selenium\\Data2.xlsx";
		System.out.println(path.indexOf("."));
		//System.out.println(x);
	}
}
