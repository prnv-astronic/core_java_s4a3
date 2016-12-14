package CORE_JAVA_WELCOM;

public class motor_bike extends bike{

	motor_bike()		// constructor
	{
		super.run();
		//run();
		
	}
	public void run()
	{
		//System.out.println("Vehical speed limit 80km/h");
		System.out.println("FROM CHILD CLASS");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		motor_bike b1 = new motor_bike();
		
	}

}
