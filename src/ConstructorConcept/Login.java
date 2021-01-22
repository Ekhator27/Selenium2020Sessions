package ConstructorConcept;

public class Login {

	String username;
	String password;
	String role;
	
	//diff between const and function:
	//1. function name can be anything...but const name will remain same as the class name
	//2. function may or  may not return a value but const will never return a value
	//3. function can be static or non static but const is alwys non static
	//4. function will be called by using the obj reference but const.. will be called when you create the Object
	//5. const will define help to initialize the class variables but function will define the class behvaiour or actions
	

	public Login(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("login with : " + un + " and " + pwd);
	}

	public void doLogin(String un, String pwd, String role) {
		System.out.println("login with : " + un + " and " + pwd + " and " + role);
	}
	
}