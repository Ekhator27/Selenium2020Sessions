package BuilderPattern;

public class Shopping {

	public static void main(String[] args) {

		AmazonApp shop = new AmazonApp();
		
		shop.doLogin("tom@gmail.com", "tom@123")
			.search("Apple Macbook pro")
			.addToCart("Apple Macbook pro")
			.doPayment("1222 2222 3333 3333", 900)
			.logout();
		
		System.out.println("----------");
		
		shop.doLogin("tom@gmail.com", "tom@123")
			.addToCart("Samsung S10")
			.doPayment("1121212@hdfc")
			.logout();
		
		
		System.out.println("----------");

		shop.doLogin(999999, 1990)
			.logout();
		
		System.out.println("----------");

		shop.doLogin(999999, 1990)
			.doPayment("1121212@hdfc")
				.logout();
		
		System.out.println("CODEEND");
		
		
		
	}

}