package BuilderPattern;

public class AmazonApp {

	public AmazonApp doLogin(String un, String pwd) {
		System.out.println("login with : " + un + " " + pwd);
		return this;
	}

	public AmazonApp doLogin(long phone, int otp) {
		System.out.println("login with : " + phone + " " + otp);
		return this;
	}

	public AmazonApp search(String productName) {
		System.out.println("search product with : " + productName);
		return this;
	}

	public AmazonApp search(String productName, int price) {
		System.out.println("search product with : " + productName + " " + price);
		return this;

	}

	public AmazonApp addToCart(String productName) {
		System.out.println("add to cart: " + productName);
		return this;

	}

	public AmazonApp doPayment(String cc, int cvv) {
		System.out.println("make the payment with : " + cc + " " + cvv);
		return this;

	}

	public AmazonApp doPayment(String upi) {
		System.out.println("make the payment with : " + upi);
		return this;

	}

	public AmazonApp logout() {
		System.out.println("logout from the application");
		return this;
	}

}