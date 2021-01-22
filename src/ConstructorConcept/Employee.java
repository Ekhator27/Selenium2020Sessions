package ConstructorConcept;

public class Employee {

	// class vars:
	String name;
	int id;
	int age;
	boolean isActive;

	// Constructor:
	// name will be same as the class name
	// const overloading is allowed in java
	// const will be called when you create the Object
	// const will help to initialize the class variables (non static) for the
	// respective object

	public Employee() {// default const... or 0 param const...
		System.out.println("0 param const...");
	}

	public Employee(int a) {// 1 param const...
		System.out.println("1 param const..." + a);
	}

	public Employee(int a, String b) {// 2 params const...
		System.out.println("2 param const..." + a + b);
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public Employee(String name, int id, int age, boolean isActive) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		Employee obj = new Employee(10, "Java");

		Employee e1 = new Employee("Tom", 101);
		System.out.println(e1.name + " " + e1.id + " " + e1.age + " " + e1.isActive);

		Employee e2 = new Employee("Peter", 102, 30, true);
		System.out.println(e2.name + " " + e2.id + " " + e2.age + " " + e2.isActive);

	}

}