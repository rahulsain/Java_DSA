package oops.abstraction;

public class RepairShop {
	public static void RepairCar(Car car) {
		System.out.println(car+" is repaired");
	}
	public static void main(String[] args) {
		WagnoR wagnor = new WagnoR();
		Audi audi = new Audi();
		
		RepairCar(wagnor);
		RepairCar(audi);
		audi.honk();
		audi.breakin();
		wagnor.breakin();

	}

}
