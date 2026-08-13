package priorityqueues;

import java.util.PriorityQueue;
import java.util.Spliterator;

public class Main {

	public static void main(String[] args) {

		PriorityQueue<String> names = new PriorityQueue<String>();

		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Emma");
		names.add("Oliver");

		names.remove("Emma");

		String pollName = names.poll();

		String peekName = names.peek();

		Spliterator<String> spliterator = names.spliterator();

		spliterator.forEachRemaining((name) -> System.out.println(name));

		System.out.println("*****************************");

		System.out.println(pollName);

		System.out.println(peekName);
	}

}