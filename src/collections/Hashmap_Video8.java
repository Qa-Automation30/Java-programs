package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap_Video8 {

	public static void main(String[] args) {
		
/* 1->HashMap me ordering nahi hota hai. I mean you can fetch the values basis on key's
 2-> Key's cant be duplicate , agar duplicate key hogi to wo latest value fetch karega 
 3-> key-> value pair me values store hoti hai
 4-> Memory me keval 1 hi null key ho sakti hai -> mark the workds null key, agar 1 se jyda null
	key hogi to wo memory me se latest wali pick karega

5-> HashMap me null values kitne bhi ho skate hai.
6-> HasMap is not thread safe, I mean un-synchronized
		*/
		HashMap<Integer,String> stdRecords = new HashMap<>();
		stdRecords.put(1, "Anoop");
		stdRecords.put(1, "xyz");
		//Key's cant be duplicate , agar duplicate key hogi to wo latest value fetch karega 
		// ----------------------------------------------------------------------------------
		stdRecords.put(2, "Ahmad");
		stdRecords.put(3, "Ankit");
		stdRecords.put(4, "Ashish");
		stdRecords.put(5, "Anuj");
		stdRecords.put(6, "Sandeep");
		//----------------------------------------------------------------
		stdRecords.put(null, "vivek");
		stdRecords.put(null, "vivek srivastava");
		//--------------------------------------------------------------------
		stdRecords.put(7, null);
		stdRecords.put(8, null);
		stdRecords.put(9, null);
		stdRecords.put(10, null);
		
		/*System.out.println(stdRecords.get(7));
		System.out.println(stdRecords.get(8));
		System.out.println(stdRecords.get(9));
		System.out.println(stdRecords.get(10));
		
		System.out.println(stdRecords.get(null));
		System.out.println(stdRecords.get(2));
		System.out.println(stdRecords.get(446));
		System.out.println(stdRecords.get(1));*/
		
// 7--> Iterator : iterate over the keys using keySet
		Iterator<Integer> it = stdRecords.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key +"----"+ stdRecords.get(key));
		}
		System.out.println("-----------------------------------------------");

// 8-->  iterate over the set(pair) using Entery Set 
		Iterator<Entry<Integer, String>> iterator =stdRecords.entrySet().iterator();
		while (iterator.hasNext()) {
				Entry<Integer, String> entry =iterator.next();
				System.out.println(entry.getKey()+"---->"+entry.getValue());
			
		}
		System.out.println("-----------------------------------------------");
		stdRecords.remove(1);
		Iterator<Integer> it1 = stdRecords.keySet().iterator();
		while (it1.hasNext()) {
			Integer key = it1.next();
			System.out.println(key +"----"+ stdRecords.get(key));
		}
		
		System.out.println("-----------------------------------------------");
		stdRecords.forEach((k,v) -> System.out.println(v));
	}

}
