package arraylist;

import java.util.ArrayList;

/*
 * lastIndexOf()
 * indexOf()
 */

public class UseFulMethodTwo {

	public static void main(String[] args) {

		ArrayList<String> colours = new ArrayList<String>();

		colours.add("Red");        // 0
		colours.add("Blue");       // 1
		colours.add(2, "Green");   // 2
		colours.add("Yellow");     // 3
		colours.add("Black");      // 4
		colours.add("White");      // 5
		colours.add("Blue");       // duplicate value accepted, index 6

		new UseFulMethodTwo().output(colours);

		System.out.println(colours.lastIndexOf("Blue"));
		// lastIndexOf() shows the last index where "Blue" is found

		System.out.println(colours.indexOf("Blue"));
		// indexOf() shows the first index where "Blue" is found
	}

	public void output(ArrayList<String> list) {

		for (String colour : list) {
			System.out.println(colour);
		}
	}
}