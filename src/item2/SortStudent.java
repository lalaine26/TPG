package item2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent {
	
	public void sortStudent() {
		// TODO Auto-generated method stub
	
		Collections.sort(listStudents,new StudentComparator());
		
		System.out.println("\n***Item 2:Sort List***\n");
		
		for (Student student:listStudents){
			System.out.println(student.getGpa()+" "+student.getName()+" "+student.getId());
		}
	}
	
	List<Student> listStudents = new ArrayList<Student>(){
		 {
			 add(new Student(1,"John",1.68));
			 add(new Student(2,"Robb",1.68));
			 add(new Student(3,"Sansa",2.68));
			 add(new Student(4,"Arya",1.88));
			 add(new Student(5,"Brad",1.78));
			 add(new Student(6,"Rickon",4.68));
			 add(new Student(7,"Jamie",3.68));
			 add(new Student(8,"Cersei",1.78));
			 add(new Student(9,"Tyrion",1.38));
			 add(new Student(10,"Daenaerys",1.08));
			 add(new Student(11,"Margaery",3.68));
			 add(new Student(12,"John",1.68));
			 add(new Student(13,"Sam",3.68));
			 add(new Student(14,"Sam",3.68));
			 add(new Student(15,"Alex",3.68));
		 }
	};

}
