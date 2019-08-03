package interfacesss;

public class TestClass 
{
	TestInterface res;
	public void myMethod(TestInterface res)
	{
		res.method2();
	}
	
	public TestClass()
	{
		this.myMethod(res);
	}
	public static void main(String[] args) 
	{
		TestClass test = new TestClass();
	}
}
