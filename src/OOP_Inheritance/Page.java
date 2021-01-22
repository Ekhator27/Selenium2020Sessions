package OOP_Inheritance;

public class Page {
	
	int timeOut = 10;
	
	public Page() {
		System.out.println("Page -- default const....");
	}
	
	public Page(int i) {
		System.out.println("Page -- one param const...." + i);
	}
	
	public void title() {
		System.out.println("Page -- title");
	}
	
	public final void logo() {
		System.out.println("Page -- logo");
	}
	
	

}