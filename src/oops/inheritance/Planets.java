package oops.inheritance;

public class Planets extends Universe {
	Planets(String name){
		
		super(name);
		System.out.println("inside planets constructor");
	}
	public void size() {
		System.out.println("planets have very big size and are heavy");
	}
	public void earth() {
		System.out.println("we live in this planet");
	}
	public void contain() {
		super.contain();
		System.out.println("planets conatain very living life like "+super.name);
	}
}
