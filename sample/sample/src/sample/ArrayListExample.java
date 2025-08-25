package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
	    list.add(456);
		list.add(56.78);
		list.add("sutherland");
		list.add('k');
		list.add(456);
		list.add(null);
		System.out.println(list + " "+list.size());
		list.add(1,"hyderabad");
		System.out.println(list + " "+list.size());
		list.remove("sutherland");
		list.remove(Integer.valueOf(456));
		System.out.println(list + " "+list.size());
		
		Iterator itr = list.listIterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			if(obj instanceof Integer) {
				System.out.println(obj);
			}
		}
	}

}
