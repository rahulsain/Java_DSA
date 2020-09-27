package singleton;

public class MainClass {

	private static AppConfig obj2;
	private static AppConfig obj3;

	public static void main(String[] args) {
		obj2 = AppConfig.getInstance();
		obj3 = AppConfig.getInstance();
		obj2.toString();
		obj3.equals(null);
	}

}
