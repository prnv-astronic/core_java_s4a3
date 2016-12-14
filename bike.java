package CORE_JAVA_WELCOM;

public class bike extends vehical{

	bike()		// child class constructor...
	{
		System.out.println("Constructor of Parent class");
	}
	public void run()
	{
		
		//System.out.println("Vehical speed limit 80km/h");
		System.out.println("FROM BIKE CLASS  "+super.add(2,5));
		super.run();
		//System.out.println("Vehical speed limit 80km/h");
		//System.out.println("Called using SUPER KEYWORD  ");
		
	}
	public void method1() {
		 System.out.println ("Child's method1()");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b1 =new bike();
		b1.speed_limit=(float)40.25;
		b1.type="BAJAJ PULSAR";
		System.out.println("TYPE: "+b1.type);
		System.out.println("Speed Limit: "+b1.speed_limit);
		b1.run();// Method called by creating object for child class
		System.out.println("Called using object:  "+b1.add(12, 23));
		vehical v1 =new vehical();// object for parent class invoke constructor of parent class
		v1.run();		// Method called by creating object for parent class
		
		
		vehical p =new bike();
		p.method2();
		
		 
	}

}
