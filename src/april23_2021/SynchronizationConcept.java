package april23_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizationConcept {

	public static void main(String[] args) {
		
		List<Integer> list = Collections.synchronizedList((new ArrayList<Integer>()));
		
		list.add(13);
		list.add(1);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(13);
		System.out.println(list);
		synchronized (list) {
			Iterator<Integer> it =list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		CopyOnWriteArrayList<String> s = new CopyOnWriteArrayList<>();
		
	}

}
