package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Hashtable<Integer, String> names = new Hashtable<Integer, String>();

		names.put(1, "Alice");
		names.put(2, "Bob");
		names.put(3, "Charlie");
		names.put(4, "David");
		names.put(5, "Emma");
		names.put(6, "Oliver");

		System.out.println(names.size());

		System.out.println(names.values());

		Hashtable<Integer, String> clone = new Hashtable<Integer, String>();

		clone.putAll(names);

		for (Map.Entry<Integer, String> map : clone.entrySet()) {

			System.out.println("Clone Key is " + map.getKey() + " and value is " + map.getValue());
		}

		System.out.println("-----New Looping-----");

		clone.replace(2, "Sophia");

		clone.remove(4);

		for (int key : clone.keySet()) {

			System.out.println("Key is " + key + " and value is " + clone.get(key));
		}

		System.out.println(clone.isEmpty());
	}

}