package item3;

import item1.IPValidationRegex;
import item2.SortStudent;

public class Main {
	
	static long startTime;
	static long endTime;
	static long elapseTime;
	
	public static void main(String[] args) { 
		
		startTime = System.currentTimeMillis();
		
		//Item 1
		IPValidationRegex ipValidationRegex = new IPValidationRegex();
		ipValidationRegex.validateIp();
		
		endTime = System.currentTimeMillis();
		
		elapseTime = endTime - startTime;
		
		System.out.println("\nElapse Time:\t" + elapseTime + " Milliseconds\n");
		System.out.println("*****************************************");
		
		startTime = System.currentTimeMillis();
		
		//Item 2
		SortStudent sortStudent = new SortStudent();
		sortStudent.sortStudent();
		
		endTime = System.currentTimeMillis();
		
		elapseTime = endTime - startTime;
		
		System.out.println("\nElapse Time:\t" + elapseTime + " Milliseconds\n");
		System.out.println("*****************************************");
		
	}
}
