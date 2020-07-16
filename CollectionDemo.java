import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionDemo {
	public static void main(String[]args) throws Exception{
		Collection values=new ArrayList();
		values.add(3);
		values.add(4);
		values.add("Sujoy");

		//USING ITARATOR (OLD METHOD)
//		Iterator i=values.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		// USING ENHANCED FOR LOOP
		for(Object i:values) {
			System.out.println(i);
		}
	}
}
