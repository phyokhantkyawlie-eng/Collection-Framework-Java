package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

/*
 *
 *   addAll();
 *   clear();
 *   isEmmpty();
 *   contains();
 * 	 offerFirst();
 * 	 offerLast();  
 * 
 */

public class UseFulMethod {
	
	
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		

		names.add("Mg Mg"); // 0
		
		names.add("Soe Soe");// 1
		
		names.add("Aung Aung");//3
		
		names.add("Min Min");//4
		
		names.add("Thu Thu");// 5
		
		names.add("Bo Bo");// 6
		
		names.add(2,"Mu Mu");// 2
		
		names.add("Soe Soe"); // Duplicate Value Accept
		
		
		// Copy 
		
		String[] nameAry = new String[names.size()];
		nameAry  = names.toArray(nameAry);
		System.out.println(Arrays.toString(nameAry));
		
//		names.clear(); // Data Clear
		
	
		LinkedList<String> people = new LinkedList<String>();
		
		people.add("Phyo Khant Kyaw");
		
		people.add("Paing Khant Kyaw");
		
		people.addAll(names);
		
		people.add("Spiderman");
		
		people.offerFirst("Htoo Aunt Shein");
		
		new UseFulMethod().output(people);
		
		// Collection Array -> Normal Array Copy
		
		String[] peopleAry = new String[people.size()];
		peopleAry = people.toArray(peopleAry);
		System.out.println(Arrays.toString(peopleAry));
		
		// Clone Collection LinkedList Array
		
		LinkedList<String> clonePeople = (LinkedList)people.clone();
		
		System.out.println(clonePeople.isEmpty() ); // Check Data
		
		System.out.println(clonePeople.contains("Spiderman"));
		
		
		System.out.println(clonePeople.getLast());
		
		System.out.println(clonePeople.getFirst());
		
	}
	
	
	
	public void output(LinkedList<String> list) {
		
		
		for(String name : list) {
			System.out.println(name);
		}
	}

}
