package maps;

public class HashCodeandEquals {

	public static void main(String[] args) {
		
	Dog sheru = new Dog("brown",3);
	Dog white = new Dog("brown",3);
		
	System.out.println(sheru+"\n"+white);
	System.out.println(sheru.equals(white));
	}

}

class Dog{
	String eyeColor;
	int age;
	
	public Dog(String col,int age) {
		this.eyeColor = col;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((eyeColor == null) ? 0 : eyeColor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (eyeColor == null) {
			if (other.eyeColor != null)
				return false;
		} else if (!eyeColor.equals(other.eyeColor))
			return false;
		return true;
	}
}
