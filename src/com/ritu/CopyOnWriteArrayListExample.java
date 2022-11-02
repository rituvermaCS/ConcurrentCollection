package com.ritu;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ritu", "Ojaswi", "Somil","Ashish");
		CopyOnWriteArrayList<String> cowArrayList = new CopyOnWriteArrayList<String>(list);
		System.out.println("List = " + cowArrayList);
		Iterator<String> iterator1 = cowArrayList.iterator();

		cowArrayList.add("Kritika");
		while(iterator1.hasNext()) {
			System.out.println("Element from iterator1 : " + iterator1.next());
		}
		
		Iterator<String> iterator2 = cowArrayList.iterator();
		while(iterator2.hasNext()) {
			System.out.println("Element from iterator2 : " + iterator2.next());
		}
	}

}
