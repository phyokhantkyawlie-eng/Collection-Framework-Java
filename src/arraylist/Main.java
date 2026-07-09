package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
	
	public static void main(String[] args) {
		
		// Creating ArrayList
		//          Datatype      arrayListName
		//ArrayList<String> colours = new ArrayList<>();
		
		ArrayList<String> colours = new ArrayList<String>();
		
		colours.add("Red"); //0
		colours.add("Blue"); //2
		colours.add("Yellow"); //3
		colours.add("White");  //4
		colours.add("Black");  //5
		
		System.out.println(colours.size());
		
		//Insert Details Index
		colours.add(2, "crimson"); 
		
		System.out.println(colours.size());
		
		System.out.println(colours.get(2));
		
		System.out.println("Output From the Colours ArrayList");

 		System.out.println(colours.get(0));
 		
 		System.out.println(colours.get(1));
 		
 		System.out.println(colours.get(2));
 		
 		System.out.println(colours.get(3));
 		
 		System.out.println(colours.get(4));
 		
 		System.out.println(colours.get(5));
 		
 	// Iterate ->names -> reverse arrays
 	 	
 	 		ListIterator<String> iterators = colours.listIterator(colours.size()); // colours -> put -> iterators
 	 		
 	 		
 	 		
 	 		while(iterators.hasPrevious()) {
 	 			String name = iterators.previous();
 	 			System.out.println(name);
 	 		}
 	 		
 	 		// Normal 
 	 		Iterator iterator = colours.iterator(); // Obj
 	 		
 	 		while(iterator.hasNext()) {
 	 			String name = (String)iterator.next();
 	 			System.out.println(colours);
 	 		}
	}
	
	

}
