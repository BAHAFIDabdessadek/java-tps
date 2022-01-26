package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class TestList {

		public static void main(String[] args) {
			
			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list2 =  Arrays.asList(1,5,6,9,16);
			
			list1.add(12);

			list1.add(23);

			list1.add(23);

			list1.add(12);
		

			// la boucle for  classique
			for(int i = 0 ; i<list1.size();i++) {
				Integer e = (Integer) list1.get(i);
				System.out.println("element"+i+" :"+e);
			}
			// la boucle for avancee
			for (Integer e  : list1) {
				System.out.println("Element "+e);	
			}
			// Un iterator
			
			Iterator<Integer> iter = list1.iterator();
			while (iter.hasNext()) {
				Integer e = iter.next();
				System.out.println("element :"+e);
			}
			// la boucle foreach de la list 
			list1.forEach(i -> System.out.println("element:"+i));
			
		
			list2.stream().map(i->i*i).filter(i->i>37).forEach(i-> System.out.println(i));
			
		}
		
		// Question 5 - Resultat 10,15,20 
	
}
