package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Spliterator;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		//Initial
		
		
		//LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		
		names.add("SpiderMan"); // 0 
		
		names.add("Captain America"); // 1
		
		names.add("Batman"); //2
		
		names.add("Superman"); //3
		
		names.add("Ironman");//4
		
		names.add("Black Widow");//5
		
		// names.add("Black Widow");//5 // No Duplicate
		
		
		//System.out.println(names.size());
		
		
		Spliterator<String> spliterator  = names.spliterator();
		
		spliterator.forEachRemaining( (n) -> System.out.println(n));
		
//		output(names);
		
		System.out.println("===========After Clone=========");
		
		LinkedHashSet<String> cloneNames = (LinkedHashSet<String>) names.clone();
		
		
		
		Spliterator<String> cloneSpliterator = cloneNames.spliterator();
		
		
		
		// try Advance
		
		final int[] i = {0};
		
		
		 while( cloneSpliterator.tryAdvance( (c) -> System.out.println ( i[0]++ +" " +c ))); // output using try advance
		

		
	}
	
	
	public static void output(LinkedHashSet<String> set){
		
		for(String name : set) {
			System.out.println(name);
		}
		
	}


}