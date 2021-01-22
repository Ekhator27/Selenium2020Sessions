package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {

//		try {
//			throw new Exception("DATA NOT AVAILABLE EXCEPTION");
//		} 
//		
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String data = null;
		if(data == null) {
			throw new Exception("DATA IS NULL EXCEPTION");
		}

	}

}