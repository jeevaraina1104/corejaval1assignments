package topic4;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> s  = new HashSet<String>();
		s.add("Jeeva");
		s.add("Vinay");
		s.add("Tharun");
		
		Iterator iterator = s.iterator();
		while(iterator.hasNext()){
			System.out.println("The Employee names are: " +iterator.next() + "");
		}
	}

}
