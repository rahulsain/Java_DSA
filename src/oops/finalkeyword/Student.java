package oops.finalkeyword;

public class Student {
	 final String father;
	Student(){
		this.father = "papa";
	}
	public  Student(String s) {
		father = s;
	}
	public final void student() {
		System.out.println(father);
	}
//	{
//		father="first";
//	}
	
}
