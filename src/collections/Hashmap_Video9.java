package collections;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap_Video9 {

	public static void main(String[] args) {
		
	/*   1. Compare two HashMaps 
	 * */
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "abc");
		map1.put(2, "xyz");
		map1.put(3, "pqr");
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "abc");
		map2.put(3, "pqr");
		map2.put(2, "xyz");
		
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(1, "abc");
		map3.put(3, "pqr");
		map3.put(3, "sasaas");
		map3.put(2, "xyz");
		
		/* Yaha pe maps ka comparesion "key-value pair" ke hisab se ho raha hai(key aur value dono ditto hone chaiye).
		 *  Means to say agar map1 and map2 me sab same to same hoga to ye true return karega.
		 *  yaha pe key and value dono compare ho rai hai with the help of equals method
			*/
		System.out.println(map1.equals(map2)); //true
		System.out.println(map1.equals(map3)); //false
		
		/*Maps ko comapre kare sirf keys ke basis pe, wo kaise karege?
		 *So phele hume differnet maps me se unki keys ko pick karna padega? ab wo kaise karege.
		 *So wo karege with the help of keySet() method 
		 *
		 *Is wale comparison me value se koi fark nai padega bus key same hone chaiye. agar mai map2 me key 1 ki 
		 * value change karke ab kar du and fir map1 to map2 se compare karu fir bhi ye true hi return karega.
		 *  */
		System.out.println(map1.keySet());  // This will return [1, 2, 3]
		System.out.println(map2.keySet()); // This will also returns  [1, 2, 3]
		// Now hum compare karege-->
		System.out.println(map1.keySet().equals(map2.keySet())); // true
		System.out.println(map1.keySet().equals(map3.keySet())); //true --> Why this is true ? 
		// bcs KyeSet() returns a SET and set dose not conatins duplicate values. so the duplicate value get ommit.
		// isiliye wo true aa raha hai.
		
		System.out.println("=====================================================");
		
		// Find the extra keys-->   V V IMPORTANT
		HashMap<Integer, String> map4 = new HashMap<>();
		map4.put(1, "abc");
		map4.put(3, "pqr");
		map4.put(2, "xyz");
		map4.put(4, "sasaas");
		map4.put(5, "asfsaf");
	
		HashSet<Integer> combinedKeys = new HashSet<>(map1.keySet());
		combinedKeys.addAll(map4.keySet());
		combinedKeys.removeAll(map1.keySet());
		System.out.println(combinedKeys);
		
		System.out.println("=====================================================");
		
		// Compare HashMaps by Values.  
		// This need to be review again and again
		
		HashMap<Integer, String> map11 = new HashMap<>();
		map11.put(11, "A");
		map11.put(22, "B");
		map11.put(33, "C");
		
		HashMap<Integer, String> map22 = new HashMap<>();
		map22.put(1, "A");
		map22.put(3, "B");
		map22.put(2, "C");
		
		HashMap<Integer, String> map33 = new HashMap<>();
		map33.put(111, "abc");
		map33.put(333, "pqr");
		map33.put(333, "sasaas");
		map33.put(222, "xyz");
		
		System.out.println(map11.values());
		System.out.println(map22.values());
	

	}

}
