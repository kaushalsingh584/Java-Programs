package com.monocept.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CRUDTreeMap {

	public static void main(String[] args) {
		System.out.println("----------------Create operation----------------");
		// does not allow null values
		// different types of treeSet constructor
		//		TreeMap()
		//		TreeMap(Comparator comp)
		//		TreeMap(Map M)
		//		TreeMap(SortedMap sm)
		TreeMap<Integer, String> treeset = new TreeMap<>();
		treeset.put(1, "Kaushal");
		treeset.put(2, "Piyush");
		treeset.put(5, "Ramesh");
		treeset.put(3, "Harshit");
		treeset.put(4, "Yash");

		System.out.println("Treeset created: " + treeset);

		// read
		System.out.println("----------------Read operation---------------");
		System.out.println("Element at the first position: " + treeset.get(1));
		System.out.println("Element at the fourth position: " + treeset.get(4));
		for (Map.Entry<Integer, String> mapElement : treeset.entrySet()) {
			System.out.println(mapElement.getKey() + " : " + mapElement.getValue());

		}

		// update
		System.out.println("----------------Update operation----------------");
		treeset.put(2, "Pankaj");
		System.out.println("Element of treemap after updating value at key 2: " + treeset);

		// delete
		System.out.println("----------------Delete operation----------------");
		treeset.remove(4);
		System.out.println("treemap after removing key 4: " + treeset);

	}

}
