package CORE_JAVA_WELCOM;


	
public class vehical {
	
	String type;
	float speed_limit;
	

	vehical ()// parent class constructor...
		{
			System.out.println("Constructor of Grand-Parent class");
		}
	
	public void run()
	{
		System.out.println("FROM VEHICLE CLASS");
	}
	
	
	public int add(int a, int b)
	{
		
		return(a+b);
	}
	
	private void method1()
	{
		 System.out.println ("Parent's method1()");
	}
		public void method2() 
		{
		 System.out.println ("Parent's method2()");
		 method1();
		}
	
	

}
