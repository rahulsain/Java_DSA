package oops;
class pokemon{
	String name;
	int power;
	pokemon(){
		System.out.println("this is default constructor");
		power = 10200;
		name = "xD";
	}
	pokemon(int power){
		this.power = power;
		name = "xD!!";
	}
	pokemon(String name){
		this.name = name;
		power = 010200;
	}
	pokemon(int power,String name){
		this.power = power;
		this.name = name;
	}
	void disPlay() {
		System.out.println(name+" has "+power+" power. very good");
	}
}

public class MyConstructor {

	public static void main(String[] args) {
		pokemon pika1 = new pokemon();
		pokemon pika2 = new pokemon(64);
		pokemon pika3 = new pokemon("pikachu");
		pokemon pika4 = new pokemon(99,"raichu");
		pika1.disPlay();
		pika2.disPlay();
		pika3.disPlay();
		pika4.disPlay();
		
		pika1.name = "pika";
		pika2.name = "hero";
		pika1.power = 59;
		pika3.power = 398;
		pika1.disPlay();
		pika2.disPlay();
		pika3.disPlay();
		pika4.disPlay();
		
		
		
	}

}
