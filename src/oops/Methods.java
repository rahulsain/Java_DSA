package oops;



class dog{
	  int legs;
	  int eyes;
	 void character() {
		System.out.println("it has "+legs+" legs and "+eyes+" eyes");
	}
}
public class Methods {

//	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		dog d1 = new dog();
		d1.eyes = 2;
		d1.legs = 4;
		dog d2 = new dog();
		d2.eyes = 3;
		d2.legs = 5;
		d1.character();
		d2.character();
		swap(d1.eyes,d2.eyes);
		swap(d1,d2);
		changeDog(d2,d1);
		d1.character();
		d2.character();
		swap(d1.eyes,d2.eyes);
		swap(d1,d2);
		int c = 32,d=34;
		swap(c,d);
		System.out.println(c+" "+d);
		
	}
	 static void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+" "+b);
	}
	 static void swap(dog a,dog b) {
			int temp = a.legs;
			a.legs = b.legs;
			b.legs = temp;
			System.out.println(a.legs+" "+b.legs);
		}
	 static void changeDog(dog d,dog e) {
		 d.legs = 10;
		 d.eyes = 11;
		 e.eyes = 12;
		 e.legs = 9;
	 }
}