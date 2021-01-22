package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		final int a = 10;// constant variable
		System.out.println(a);

		final int days = 7;
		int totalSalary = 10 * days;
		System.out.println(totalSalary);

		BMW b = new BMW();
		b.start();// Overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// individual
		b.engine();
		System.out.println(b.color);

		// Audi:
		Audi ad = new Audi();
		ad.start();
		ad.stop();
		ad.refuel();
		ad.theftSafety();

		Car.wheels();

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		// Top Casting:
		Car c1 = new BMW();// child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();

		Vehicle v = new BMW();
		v.engine();

		// Down Casting:
		// BMW b1 = (BMW) new Car();//ClassCastException

	}

}