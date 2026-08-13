package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, String> names = new HashMap<Integer, String>();

		names.put(1, "Alice");
		names.put(2, "Bob");
		names.put(3, "Charlie");
		names.put(4, "David");
		names.put(5, "Emma");
		names.put(6, "Oliver");
		names.put(7, "Sophia");

		for (Map.Entry<Integer, String> name : names.entrySet()) {
			System.out.println("Key is " + name.getKey() + " and value is " + name.getValue());
		}

		System.out.println("===================Value output with KeySet=====================");

		for (int key : names.keySet()) {
			System.out.println(names.get(key));
		}

		System.out.println("=============Removing the Array====================");

		for (Map.Entry<Integer, String> name : names.entrySet()) {
			System.out.println("Key is " + name.getKey() + " and value is " + name.getValue());
		}

		System.out.println("==============Contains Checking The Array=============");

		String isContain = names.containsKey(5) ? "Yes" : "No";

		String isContainValue = names.containsValue("Emma") ? "Yes" : "No";

		System.out.println(isContain);

		System.out.println(isContainValue);

		System.out.println(names.get(5).equals("Emma"));

		System.out.println(names.get(1).equals("Alice"));

		System.out.println("============Replace Data in Array==========");

		names.replace(2, "Daniel");

		for (int key : names.keySet()) {
			System.out.println(names.get(key));
		}

		System.out.println("======Output Only One========");

		System.out.println(names.getOrDefault(11, "Unknown"));

		for (Map.Entry<Integer, String> name : names.entrySet()) {
			System.out.println("Key is " + name.getKey() + " and value is " + name.getValue());
		}
	}

}