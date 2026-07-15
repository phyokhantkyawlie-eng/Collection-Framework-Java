package hashset;

import java.util.HashSet;
import java.util.Spliterator;

public class Main {
	
	public static void main(String[] args) {
		
		
		// Create 
		
		//HashSet<Integer> numbers = new HashSet<Integer>();
		
		HashSet<String> hset = new HashSet<String>();
		
		// Insertion
		hset.add("Mg Mg"); // 0
		
		hset.add("Soe Soe"); // 1
		
		hset.add("Ko Ko"); // 2
		
		hset.add("Su Su"); // 3
		
		hset.add("Lin Lin"); // 4
		
		hset.add("Tun Tun"); // 5
		
		hset.add("Tun Tun");
		
		
		//output(hset);
		
//		System.out.println(hset.size());
//		
//		Spliterator<String> names = hset.spliterator();
//		
//		names.forEachRemaining( (i) -> System.out.println(i) ); // lamda  (n) 	// (n) -> sysout(n)
		
		
		System.out.println("==========After Clone==============");
		
		
		hset.remove("Su Su"); // remove
		// Clone 
		HashSet<String> myClone = (HashSet<String>) hset.clone();
		
		
		Spliterator<String> cloneNames = myClone.spliterator();
		
		cloneNames.forEachRemaining( (c) -> System.out.println(c));
		
		System.out.println(myClone.isEmpty()); // Check Empty or not
		
		
		
		
		
		
		 
	}
	
	
	public static void output(HashSet<Integer> set){
		
		for(int i : set) {
			System.out.println(i);
		}
		
	}

}