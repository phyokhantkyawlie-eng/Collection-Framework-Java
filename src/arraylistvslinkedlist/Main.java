package arraylistvslinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		
		List<Integer> numbers;
		
	
		Main m = new Main();
		
		m.doWork(arrayList, "Array List");
		
		m.doWork(linkedList, "Linked List");
		
		
		
	}
	

	public void doWork(List<Integer> list , String name) {
		
		long start = System.currentTimeMillis();
	
		
		for (int i = 0 ; i <  1E5 ; i++) {
			list.add(i);
			
		}
		
		for (int i = 0 ; i <  1E5 ; i++) {
			list.add(0, i);
			
		}
		
		
		
		long end = System.currentTimeMillis();
		
		
		System.out.println("It take time "+ (end-start) + " for " + name);
		
	}

}