package ComparablesandComparators;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> stud = new ArrayList<>();
		
		stud.add(new Student("raja",82));
		stud.add(new Student("raja",22));
		stud.add(new Student("ganja",42));
		stud.add(new Student("gajni",83));
		stud.add(new Student("remza",92));
		stud.add(new Student("remzi",62));
//		Collections.sort(stud,( o1,  o2)->{
//				if(o1.name.equals(o2.name))
//				return o1.marks - o2.marks;
//				else
//					return o1.name.compareTo(o2.name);
//		});
		
//		Collections.sort(stud,( o1,  o2)-> o1.name.compareTo(o2.name));
		
		Collections.sort(stud,Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		
		stud.forEach(System.out::println);
	}

}

class SortBynameThenClass implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name))
		return o1.marks - o2.marks;
		else
			return o1.name.compareTo(o2.name);
		
	}
	
}
