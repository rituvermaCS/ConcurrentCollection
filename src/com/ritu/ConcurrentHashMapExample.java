package com.ritu;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	
public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> cMap = new ConcurrentHashMap<>();
		cMap.put(1, "Taj Mahal");
		cMap.put(2, "Qutab Minar");
		cMap.put(3, "Char Minar");
		
		Iterator<Integer> it = cMap.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			if(key == 2)
				cMap.put(2, "Gateway of India");
			System.out.println(key + " : " + cMap.get(key));
		}
	}

}
