package treemap;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		TreeMap<String, String> tmap = new TreeMap<String, String>();

		tmap.put("Zero", "Alice");
		tmap.put("One", "Bob");
		tmap.put("Two", "Charlie");
		tmap.put("Three", "David");
		tmap.put("Four", "Emma");
		tmap.put("Five", "Oliver");

		System.out.println(tmap.values());

		tmap.replace("Two", "Sophia");

		for (Map.Entry<String, String> map : tmap.entrySet()) {
			System.out.println("Key is " + map.getKey() + " and value is " + map.getValue());
		}

		TreeMap<String, String> clone = (TreeMap<String, String>) tmap.clone();

		System.out.println("------After Cloning Result-----");

		clone.clear();

		boolean contains = clone.containsKey("Two");

		System.out.println(contains);

		for (Map.Entry<String, String> map : clone.entrySet()) {
			System.out.println("Key is " + map.getKey() + " and value is " + map.getValue());
		}

		System.out.println("------After Put All Result------");

		TreeMap<String, String> putResult = new TreeMap<String, String>();

		putResult.putAll(tmap);

		for (Map.Entry<String, String> map : putResult.entrySet()) {
			System.out.println("Key is " + map.getKey() + " and value is " + map.getValue());
		}

		System.out.println(putResult.size());
	}

}