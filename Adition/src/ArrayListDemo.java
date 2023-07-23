import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String > al=new ArrayList<>();
		
		al.add("ramesh");
		al.add("satish");
		al.add("sandeep");
		al.add("maroti");
		al.add("ramesh");
		
		System.out.println(al);
		for(String i:al) {
			System.out.println(i);
		}
       
	}

}
