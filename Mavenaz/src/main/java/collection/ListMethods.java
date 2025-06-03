package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> a = new ArrayList <String>(); 
		a.add("Apple");
		a.add("Lemon");
		a.add("Orange");
		a.add("Pineapple");
		a.add("Pomegranet");
		System.out.println(a);
		System.out.println(a.get(4));
		a.set(2,"Apple");
		System.out.println(a);
		System.out.println(a.indexOf("Apple"));
		System.out.println(a.lastIndexOf("Apple"));
		a.remove(2);
		System.out.println(a);
		System.out.println(a.contains("Pineapple"));
		System.out.println(a.isEmpty());  
		System.out.println(a.size());
	}


}
