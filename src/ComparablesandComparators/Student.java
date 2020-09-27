package ComparablesandComparators;

public class Student implements Comparable<Student> {

		String name;
		int marks;
		
		public Student(String name, int marks) {
			super();
			this.name = name;
			this.marks = marks;
			
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", marks=" + marks + "]";
		}

		@Override
		public int compareTo(Student arg0) {
			return this.marks - arg0.marks;
		}
		
	
		
}
