package oops.inheritance;

public class Stars extends Universe {
	Stars(String name){
	super(name);
	System.out.println("inside stars constructor");
	}
	
	public void energy() {
		System.out.println("stars are energetic");
	}
	public void hot() {
		System.out.println("stars are very hot");
	}
}
