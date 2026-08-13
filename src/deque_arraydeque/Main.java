package deque_arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Spliterator;

public class Main {

	public static void main(String[] args) {

		Deque<String> names = new ArrayDeque<String>();

		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Emma");

		names.offer("Oliver");
		names.offer("Sophia");

		String peekName = names.peek();

		String removeName = names.remove();

		Spliterator<String> spliterator = names.spliterator();

		spliterator.forEachRemaining((name) -> System.out.println(name));

		System.out.println(names.size());

		System.out.println("************************");

		System.out.println(peekName);

		System.out.println(removeName);
	}

}