package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		Stars s = new Stars("semanticis");
//		s.name = "altruist";
		
//		s.display();
//		s.hot();
//		s.contain();
		
		Universe u = s;
		Stars s1 = (Stars) u;
		u.contain();
		s1.contain();
		Planets p = new Planets("earthling");
		p.contain();
		
//		boolean isRight = ;
		System.out.println(s1 instanceof Stars);
		System.out.println(u instanceof Planets);
		System.out.println(s1 instanceof Universe);
		System.out.println(u instanceof Universe);
		System.out.println(u instanceof Stars);
	}

}
