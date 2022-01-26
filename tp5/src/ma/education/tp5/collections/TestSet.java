package ma.education.tp5.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main (String[] args) {

	Set <String> set1 = new HashSet<String>();
	
	
//		set.add("ABC1");
//		set.add("ABC2");
//		set.add("ABC3");
//		set.add("ABC1");
//		set.add("ABC4");
//		set.add("ABC5");

		set1.forEach(i-> System.out.println(i));
		
		Set<Client> set2 = new HashSet<Client>();
		
		
		set2.add(new Client(1,"ALAMI")); 
		set2.add(new Client(1,"ALAMI"));
		set2.add(new Client(2,"SOUHAIL")); 
		
		set2.forEach(i-> System.out.println(i));
		
		Set<Integer> set3 = new TreeSet<>();
		set3.add(22);
		set3.add(11);
		set3.add(15);
		set3.add(9);
		set3.forEach(i-> System.out.println(i));
		
		Set<Client> set4 = new TreeSet<>(); 
		set4.add(new Client(1,"OMAR")); 
		set4.add(new Client(3,"SAID"));
		set4.add(new Client(2,"HASSAN")); 
		set4.forEach(i-> System.out.println(i));
		
		
			Comparator<Client> c = new CodeComparator(); 
			Set<Client> set5 = new TreeSet<>(c); 
			set5.add(new Client(1,"OMAR")); 
			set5.add(new Client(3,"SAID")); 
			set5.add(new Client(2,"HASSAN"));
			set5.forEach(i-> System.out.println(i));
			
	
			Set<Client> set6 = new TreeSet<>((c1,c2)->c1.code-c2.code);
			set6.add(new Client(1,"OMAR"));
			set6.add(new Client(3,"SAID"));
			set6.add(new Client(2,"HASSAN"));
			set6.forEach(i-> System.out.println(i));
			
			Set<Client> set7 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
			set7.add(new Client(1,"OMAR"));
			set7.add(new Client(3,"SAID"));
			set7.add(new Client(2,"HASSAN"));
			set7.forEach(i-> System.out.println(i));
	}
	
}
