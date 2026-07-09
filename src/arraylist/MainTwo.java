package arraylist;


import java.util.ArrayList;
import java.util.Arrays;

/*
 * contains()
 * clone()
 * toArray()
 * removeAll()
 * retainAll()
 * addAll()
 */

public class MainTwo {

	public static void main(String[] args) {

		ArrayList<String> colours = new ArrayList<String>();

		colours.add("Red");       // 0
		colours.add("Blue");      // 1
		colours.add(2, "Green");  // 2
		colours.add("Yellow");    // 3
		colours.add("Black");     // 4
		colours.add("White");     // 5
		colours.add("Blue");      // duplicate value accepted

		String[] colourArray = new String[colours.size()];
		colourArray = colours.toArray(colourArray);

		System.out.println(Arrays.toString(colourArray));

		// using Object array
		Object[] objectArray = colours.toArray();
		System.out.println(Arrays.toString(objectArray));

		// Clone
		ArrayList<String> copiedColours = (ArrayList<String>) colours.clone();

		ArrayList<String> favouriteColours = new ArrayList<String>();

		favouriteColours.add("Blue");
		favouriteColours.add("Pink");

		System.out.println(colours.contains("Red"));

		colours.removeAll(favouriteColours);
		// removes colours that also exist in favouriteColours

		favouriteColours.add("Yellow");
		favouriteColours.add("Black");

		colours.retainAll(favouriteColours);
		// keeps only colours that also exist in favouriteColours

		favouriteColours.add("Purple");

		favouriteColours.addAll(1, colours);
		// add colours into favouriteColours starting from index 1

		new MainTwo().output(favouriteColours);
	}

	public void output(ArrayList<String> list) {

		for (String colour : list) {
			System.out.println(colour);
		}
	}
}