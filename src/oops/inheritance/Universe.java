package oops.inheritance;

public class Universe {
	Universe(String name){
		this.name = name;
		System.out.println("inside universe constructor");
	}
	protected String name;
	
	public void contain() {
		System.out.println("universe contains everyting including "+name);
	}
	protected void display() {
		System.out.println("universe is full of stars and planets and everything that we havent discovered yet!");
	}
}
