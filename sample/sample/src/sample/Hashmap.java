package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> data = new HashMap<String,Integer>();
		data.put("yoyo", 2);
		data.put("monkey", 10);
		data.put("d", 22);
		data.put("luffy", 22);
		data.put("yoyo", 2);
		data.put("monkey", 9);
		
        System.out.println(data);
        System.out.println(data.get("d"));
        Set<Entry<String, Integer>> set = data.entrySet();
        Iterator<Entry<String, Integer>> itr = set.iterator();
        while(itr.hasNext())
        	System.out.println(itr.next());
	}

}
