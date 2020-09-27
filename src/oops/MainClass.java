package oops;

class laptop{
	int ram;
	String name;
	float size;
	public void performance(){
		System.out.println(name+" pc has very good "+ ram+" gb performance");
	}
	public void display() {
		System.out.println("it has display of "+size+" inch");
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		laptop dell = new laptop();
		laptop acer = new laptop();
		dell.name = "Dell";
		dell.ram = 8;
		dell.size =14f;
		acer.name = "Acer";
		acer.ram = 16;
		acer.size =15f;
		dell.display();
		dell.performance();
		acer.performance();
		acer.display();
		
	}

}
