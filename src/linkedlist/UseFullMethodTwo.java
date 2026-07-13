package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

/*
 *  peekfirst();
 *  poll();
 *  pollfirst();
 *  polllast();
 *  pop();
 *  remove() current state remove
 *  clear() all data 
 *  removeFirstOccurrence() -> remove details index data
 *  
 *  removeLast();
 */

public class UseFullMethodTwo {
	
	public static void main(String[] args) {
		LinkedList<String> people = new LinkedList<String>();
		
		people.add("Phyo Khant Kyaw");
		
		people.add("Paing Khant Kyaw");
		
		people.add("Spiderman");
		
		people.offerFirst("Htoo Aunt Shein");
		
		
		LinkedList<String> canes =  (LinkedList<String>) people.clone();
		
		
		String[] peopleAry = new String[people.size()];
		peopleAry = people.toArray(peopleAry);
		System.out.println(Arrays.toString(peopleAry));
		System.out.println(canes.peekFirst()); // first  data 
		
		System.out.println(canes.peek()); // first data
		
		System.out.println(canes.peekLast()); // last data
		
//		output(canes);
		
//		String name = canes.poll(); // poll first index take -> index data not contain
		
		
//		String name = canes.pollFirst(); // 
		
		
		
//		String name = canes.pollLast(); // election from array and remove last index
	 
//		canes.pop(); // FIFO 
		
		
		canes.push("Lufy"); //LIFO 
		
	
		
//		canes.removeFirst(); // remove first index data
		
//		canes.removeFirstOccurrence("Phyo Khant Kyaw");
		
		
		
//		canes.removeLast(); // Remove last index

		
		canes.set(2, "Bo Gyoke Gyi"); // set data to linkedlist
		
		

		output(canes);  
		
		
	}
	
	
	public  static  void output(LinkedList<String> list) {
		
		
		for(String name : list) {
			System.out.println(name);
		}
	}

}