package mypackage;

import java.util.*;

public class SimpleCollection {

	public SimpleCollection() {
		// TODO Auto-generated constructor stub
		Collection<Integer> c = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
			c.add(i); // Autoboxing
		for(Integer i : c)
			System.out.print(i + ", ");
	}

}
