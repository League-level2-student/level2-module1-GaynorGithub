package intro_to_array_lists;

import java.awt.List;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> stuff = new ArrayList<String>();
		//2. Add five Strings to your list
		stuff.add("Hey, ");
		stuff.add("It's ");
		stuff.add("Free ");
		stuff.add("Real ");
		stuff.add("Estate!");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stuff.size(); i++) {
			System.out.println(stuff.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String j : stuff) {
			System.out.println(j);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < stuff.size(); i++) {
			if(i%2 != 1 && i != 0) {
				System.out.println(stuff.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = stuff.size() - 1; i >= 0; i--) {
			System.out.println(stuff.get(i));
		}
		
		System.out.println("");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < stuff.size(); i++) {
			if (stuff.get(i).contains("e") || stuff.get(i).contains("E")) {
				
				
				System.out.println(stuff.get(i));
			}
		}
	}
}
