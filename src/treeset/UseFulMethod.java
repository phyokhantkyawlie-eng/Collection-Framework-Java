package treeset;

import java.util.Spliterator;
import java.util.TreeSet;

public class UseFulMethod {

	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<String>();

		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Emma");
		names.add("Oliver");

		TreeSet<String> tset = new TreeSet<String>();

		tset.add("Sophia");

		tset.addAll(names);

		Spliterator<String> spliterator = tset.spliterator();

		spliterator.forEachRemaining((n) -> System.out.println(n));

		System.out.println("******************************************");

		System.out.println(tset.headSet("Emma"));

		System.out.println(tset.higher("David"));

		System.out.println(tset.lower("David"));

		System.out.println(tset.subSet("Charlie", "Sophia"));

		System.out.println(tset.tailSet("Emma"));
	}

}