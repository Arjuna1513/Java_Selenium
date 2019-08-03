package interfacesss;

public interface TestInterface 
{
	public void method1();
	
	public default void method2()
	{
		System.out.println("Test Method2");
	}
}
