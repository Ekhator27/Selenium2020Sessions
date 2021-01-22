package ConstructorConcept;

public class TestCar {

	public static void main(String[] args) {

		Car c1 = new Car("Alto", 3);
		Car c2 = new Car("BMW", 70, "Blue", 12.33);
		Car c3 = new Car("Audi", 80, "Red");

		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + c1.mileage);

		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + c2.mileage);

		Login lp_cust = new Login("tom@gmail.com", "tom123");
		lp_cust.doLogin(lp_cust.username, lp_cust.password);

		Login lp_seller = new Login("xeon@gmail.com", "xeon123");
		lp_seller.doLogin(lp_seller.username, lp_seller.password);
		
		
		Login lp_dist = new Login("abc@gmail.com", "abc123", "Distributor");
		lp_dist.doLogin(lp_dist.username, lp_dist.password, lp_dist.role);

	}

}