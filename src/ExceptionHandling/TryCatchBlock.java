package ExceptionHandling;

public class TryCatchBlock {
	
	String name = "Java";

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj = new TryCatchBlock();
		//obj = null;

		try {
			System.out.println(obj.name);
			int i = 9/0;
			System.out.println("testing");
			System.out.println("testing");

		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception is coming....");
			//e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming....");
		}
		finally{
			System.out.println("Inside finally block....");
			System.out.println("Disconnect with DB...");
		}
		
		
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");

		
		
		
		
	}

}