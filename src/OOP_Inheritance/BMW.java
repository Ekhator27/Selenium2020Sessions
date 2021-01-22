package OOP_Inheritance;

public class BMW extends Car{
	
	String color = "Blue";
	
	//Method Overriding: When we have a method in parent class and the same method
	//in child class with the same and same number of parameters
	//RunTime Poly+Morphism
	
	//Multiple Inheritance --- Diamond Problem -- is not allowed from class to class
	//its allowed with Interface to class
	
	//Multi-level Inheritance is allowed in Java 
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	
	
	
	

}