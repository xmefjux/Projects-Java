package mypackage;

import java.util.*;
import static net.mindview.util.Print.*;

public class NameGenerator {
	
	private static String names[] = { "Tyler Durden", "Narrator", "Marla Singer", "Angel Face", "Bob", "Cornelius" };
	private static int index;
	
	public static String next(){
		if(index >= names.length)
			index = 0;
		return names[index++];
	}

	public NameGenerator() {
		// TODO Auto-generated constructor stub
		ArrayList<String> first = new ArrayList<String>();
		first.add(next());
		first.add(next());
		first.add(next());
		first.add(next());
		first.add(next());
		first.add(next());
		first.add(next());
		first.add(next());
		first.add(next());
		first.add(next());
		print("ArrayList: "+first);
		
		LinkedList<String> second = new LinkedList<String>();
		second.add(next());
		second.add(next());
		second.add(next());
		second.add(next());
		second.add(next());
		print("LinkedList: "+second);
		
		HashSet<String> third = new HashSet<String>();
		third.add(next());
		third.add(next());
		third.add(next());
		third.add(next());
		print("HashSet: "+third);
		
		LinkedHashSet<String> fourth = new LinkedHashSet<String>();
		fourth.add(next());
		fourth.add(next());
		fourth.add(next());
		fourth.add(next());
		print("LinkedHashSet: "+fourth);
		
		TreeSet<String> fifth = new TreeSet<String>();
		fifth.add(next());
		fifth.add(next());
		fifth.add(next());
		fifth.add(next());
		print("TreeSet: "+fifth);
	}

}
