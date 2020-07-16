import java.util.Collection;
import java.util.ArrayList;
public class CollectionDemoTwo {
	public static void main(String[]args) throws Exception{
		Collection<Integer> values=new ArrayList<Integer>();
		values.add(4);
		values.add(343);
		for(int i:values) {
			System.out.println(i);
		}
	}
}
