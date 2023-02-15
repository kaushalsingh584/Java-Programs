package com.monocept.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class CRUDLinkedHashMap {

	public static void main(String[] args) {

		System.out.println("----------------Create operation----------------");
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "Kaushal");
		linkedHashMap.put(2, "Piyush");
		linkedHashMap.put(5, "Ramesh");
		linkedHashMap.put(3, "Harshit");
		linkedHashMap.put(4, "Yash");

		System.out.println("Hashmap created: " + linkedHashMap);

		// read
		System.out.println("----------------Read operation---------------");
		System.out.println("Element at the first position: " + linkedHashMap.get(1));
		System.out.println("Element at the fourth position: " + linkedHashMap.get(4));
		for (Map.Entry<Integer, String> mapElement : linkedHashMap.entrySet()) {
			System.out.println(mapElement.getKey() + " : " + mapElement.getValue());

		}

		// update
		System.out.println("----------------Update operation----------------");
		linkedHashMap.put(2, "Pankaj");
		System.out.println("Element of hashmap after updating value at key 2: " + linkedHashMap);

		// delete
		System.out.println("----------------Delete operation----------------");
		linkedHashMap.remove(4);
		System.out.println("hashset after removing key 4: " + linkedHashMap);

	}

}
