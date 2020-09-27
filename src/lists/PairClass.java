package lists;

public class PairClass<X,Y,Z> {
	X x;
	Y y;
	Z z;
	PairClass(X x,Y y,Z z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	PairClass(){
		System.out.println("please try again");
	}
	public void getDescription() {
		System.out.println(x+", "+y+", "+z);
	}
}
