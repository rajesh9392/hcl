package com.hcl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap {
	public static void main(String[] args) {
		Moblie m1 = new Moblie("samsung",100);
		Moblie m2 = new Moblie("nokia",200);
		Moblie m3 = new Moblie("realme",300);
		Moblie m4 = new Moblie("oneplus",400);
		
		//ConcurrentHashmap cm = new ConcurrentHashmap();
		ConcurrentHashMap<Integer,Moblie> chm= new ConcurrentHashMap<>();
		chm.put(1, m1);
		chm.put(2, m2);
		chm.put(3, m3);
		chm.put(4, m4);
	
		for(Entry<Integer,Moblie> e: chm.entrySet()) {
			System.out.println(e.getKey()+  "=" + e.getValue());
			
		}
		
		
	
		
	}

}
