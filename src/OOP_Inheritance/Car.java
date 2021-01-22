package OOP_Inheritance;

public class Car extends Vehicle{
	
	//final --- is used to prevent inheritance and prevent the method overriding

	String color = "Red";
	
	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void wheels() {
		System.out.println("Car - wheels");
	}

}