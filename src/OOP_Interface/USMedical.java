package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee = 10;
	//vars are static and final by default
	
	//abstract methods: a method which does not have method body
	//prototype methods
	//no method body - only method declaration for non static methods
	//can not create the object of Interface
	
	public void physioServices();
	
	public void cardioServices();

	public void emergencyServices();
	
	public void services_911();
	
	public String getPatientDetails();
	
	//after JDK 1.8:
	//1. can have static methods in Interface with the method body:
	public static void billing() {
		System.out.println("US -- billing system");
	}
	
	//2. can create a default method with method body:
	default void ambulanceServices() {
		System.out.println("US -- ambulance Services : " + 10000);
	}
	
	
	

}