package ExceptionHandling;

public class ThrowableConcept {

	public static void main(String[] args) {

		
		System.out.println("launch browser");
		
		System.out.println("enter the url");
		
		try {
			int i = 9/0;
		}
		
		catch(Throwable e) {
			System.out.println("some exception is coming....");
			e.printStackTrace();
		}
		
		System.out.println("end...");
		
		
		
		
	}

}