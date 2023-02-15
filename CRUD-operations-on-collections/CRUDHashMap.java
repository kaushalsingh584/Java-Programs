package com.monocept.test;

import java.util.HashMap;

public class CRUDHashMap {

	public static void main(String[] args) {

		System.out.println("----------------Create operation----------------");
		HashMap<Integer,String> map = new HashMap<>();
		map.put( 1,"Kaushal");
		map.put( 5,"Ramesh");
		map.put( 2,"Piyush");
		map.put( 3,"Harshit");
		map.put( 4,"Yash");
		
		System.out.println("Hashmap created: " + map);

		// read
		System.out.println("----------------Read operation---------------");
		System.out.println("Element at the first position: " + map.get(1));
		System.out.println("Element at the fourth position: " + map.get(4));

		// update
		System.out.println("----------------Update operation----------------");
		map.put(2,"Pankaj");
		System.out.println("Element of hashmap after updating value at key 2: " + map);

		// delete
		System.out.println("----------------Delete operation----------------");
		map.remove(4);
		System.out.println("hashset after removing key 4: " + map);

	}

}
