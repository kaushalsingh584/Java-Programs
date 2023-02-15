package com.monocept.test;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CRUDTreeSet {

	public static void main(String[] args) {
		System.out.println("----------------Create operation----------------");
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(10);
		System.out.println("TreeSet created: " + treeSet);

		// read
		System.out.println("----------------Read operation---------------");
		System.out.println("Accessing and removing element at the first position: "+ treeSet.pollFirst());
		System.out.println("Element 10 is present in Hashset: " + treeSet.contains(10));

		// update
		System.out.println("----------------Update operation----------------");
		treeSet.remove(30);
		treeSet.add(50);
		System.out.println("Element of hashset after updating element 30 to 50: " + treeSet);

		// delete
		System.out.println("----------------Delete operation----------------");
		treeSet.remove(10);
		System.out.println("hashset after removing element 10: " + treeSet);

	}

}
