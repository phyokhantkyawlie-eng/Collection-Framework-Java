package treeset;

import java.util.Spliterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<String>();

		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Emma");
		names.add("Oliver");

		TreeSet<Integer> numbers = new TreeSet<Integer>();

		numbers.add(22);
		numbers.add(19);
		numbers.add(40);
		numbers.add(30);
		numbers.add(25);

		Spliterator<Integer> spliterator2 = numbers.spliterator();

		spliterator2.forEachRemaining((number) -> System.out.println(number));

		TreeSet<String> tset = new TreeSet<String>();

		tset.add("Sophia");

		tset.addAll(names);

		Spliterator<String> tsetSpliterator = tset.spliterator();

		tsetSpliterator.forEachRemaining((t) -> System.out.println(t));
	}

}