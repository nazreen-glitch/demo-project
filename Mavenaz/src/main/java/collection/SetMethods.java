package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s= new HashSet <String>();
		Set<String> g= new HashSet <String>();
		s.add("Purple");
		s.add("Red");
		s.add("Blue");
		g.add("Pink");
		g.add("Orange");
		System.out.println(s);
		System.out.println(g);
 		s.addAll(g);
 		System.out.println(s);
 		System.out.println(s.contains("Blue"));
 		System.out.println(s.containsAll(g));
 		System.out.println(g.containsAll(s));
 		System.out.println(s.isEmpty());
 		s.remove("Pink");
 		System.out.println(s);
 		s.removeAll(g);
 		System.out.println(s);
 		System.out.println(s.size());
 		s.clear();
 		System.out.println(s);
	}

}
