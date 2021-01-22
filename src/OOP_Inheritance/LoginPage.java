package OOP_Inheritance;

public class LoginPage extends Page {

	int timeOut = 20;

	public LoginPage(int p) {
		super(p);
		System.out.println("Login Page -- default const...");
	}

	@Override
	public void title() {
		System.out.println("Login Page -- title");
	}

	public void display() {

		System.out.println(timeOut);
		System.out.println(super.timeOut);
		title();
		super.title();
	}

	public static void main(String a[]) {
		LoginPage lp = new LoginPage(100);
		lp.display();
	}

}