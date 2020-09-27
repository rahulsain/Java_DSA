package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		Pet p = d;
		Animal a = d;
		
		d.walk();
		p.walk();
		
		greet();
		greet("jija");
		greet("pitaji",7);
		System.out.println(a.s);
		System.out.println(d.s);
		System.out.println(p.s);
		
		
	}
	public static void greet() {
		System.out.println("hello");
	}
	public static void greet(String s) {
		System.out.println(s);
	}
	public static void greet(String s,int c) {
		System.out.println(s+c);
	}
}
