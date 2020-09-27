package oops.packages.models;

public class Student {
		
	private String name;
	public Student(String name){
		this.name = name;
	}
		
	public void display() {
		 System.out.println(name+password());
		 
	 }
	 
	 private String password() {
		return "  pawrd";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
