package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ConvertMapToArray {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		
		
		ArrayList<String> key = new ArrayList<>(map.keySet());
		ArrayList<String> value = new ArrayList<>(map.values());
		System.out.println(key);
		for(String t : key)
		{
			System.out.println(t);
		}
		System.out.println(value);
		for(String t1 : value)
		{
			System.out.println(t1);
		}
		Iterator<Entry<String, String>> it	=map.entrySet().iterator();
		while (it.hasNext()) {
				Entry<String, String> ent=it.next();
				System.out.println(ent.getKey());
				System.out.println(ent.getValue());
		}
	}

}
