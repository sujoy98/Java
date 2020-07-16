import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class ListDemo {
	public static void main(String[]args) {
	List<Integer> values=new ArrayList<Integer>();
	values.add(4);
	values.add(545);
	values.add(523);
	values.add(55);
	values.add(565);
	values.add(534);
	values.add(5343);
	values.add(53434);
	values.add(53);
	values.add(58);
	values.add(52);
	
	// to add elements between 4 and 5 we simply use indexing
	values.add(1,2);
	// to remove elements by index, we can also remove any elements of their first occurance 
	values.remove(0);
	//to sort we need to import Collections class
	Collections.sort(values);
	//to reverse sort we need to import Collections class
	Collections.reverse(values);
	//System.out.println(values); to print the object of the list in [4, 5] format
	for(int i:values) {
		System.out.println(i);
		}
	}
}
