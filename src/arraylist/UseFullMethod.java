package arraylist;

import java.util.ArrayList;

// clear()
// isEmpty()
// remove()
// addAll()

public class UseFullMethod {

	public static void main(String[] args) {

		ArrayList<String> colours = new ArrayList<String>();

		colours.add("Red");        // 0
		colours.add("Blue");       // 1
		colours.add(2, "Green");   // 2
		colours.add("Yellow");     // 3
		colours.add("Black");      // 4
		colours.add("White");      // 5
		colours.add("Blue");       // duplicate value accepted, index 6

		System.out.println("-------BEFORE------------");

		new UseFullMethod().output(colours);

		// colours.clear(); 
		// clear() removes all data from the ArrayList

		System.out.println(colours.isEmpty());
		// isEmpty() checks whether the ArrayList is empty or not

		String removedColour = colours.remove(3);
		// remove index 3, which is "Yellow"

		System.out.println(removedColour);

		ArrayList<String> favouriteColours = new ArrayList<String>(colours);
		// copy colours data into favouriteColours

		System.out.println(favouriteColours.size());

		ArrayList<String> extraColours = new ArrayList<String>();

		extraColours.add("Pink");
		extraColours.add("Purple");

		colours.addAll(extraColours);
		// add extraColours into colours ArrayList

		System.out.println("--------AFTER ADDING----------");

		new UseFullMethod().output(colours);
	}

	public void output(ArrayList<String> list) {

		for (String colour : list) {
			System.out.println(colour);
		}
	}
}