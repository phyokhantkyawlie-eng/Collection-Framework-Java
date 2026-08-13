package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> names = new LinkedHashMap<Integer, String>();

		names.put(1, "Alice");
		names.put(2, "Bob");
		names.put(3, "Charlie");
		names.put(4, "David");
		names.put(5, "Emma");
		names.put(6, "Oliver");
		names.put(7, "Sophia");

		System.out.println(names.size());

		for (Map.Entry<Integer, String> map : names.entrySet()) {
			System.out.println("Key is " + map.getKey() + " and value is " + map.getValue());
		}

		System.out.println("================Cloning Into New Array===========");

		LinkedHashMap<Integer, String> cloneNames =
				(LinkedHashMap<Integer, String>) names.clone();

		for (Map.Entry<Integer, String> map : cloneNames.entrySet()) {
			System.out.println("Key is " + map.getKey() + " and value is " + map.getValue());
		}

		System.out.println("=======Checking the Array=======");

		cloneNames.clear();

		boolean isEmpty = cloneNames.isEmpty();

		System.out.println(isEmpty);

		String contains = cloneNames.containsValue("Emma") ? "Yes" : "No";

		System.out.println(contains);
	}

}