package com.monocept.test;

import java.util.LinkedHashSet;

public class CRUDLinkedHashSet {

	public static void main(String[] args) {
		
		
		System.out.println("----------------Create operation----------------");
		LinkedHashSet<Integer> linkedhashset
        = new LinkedHashSet<Integer>();
	    linkedhashset.add(10);
	    linkedhashset.add(20);
	    linkedhashset.add(30);
	    linkedhashset.add(40);
	    linkedhashset.add(20);
	    linkedhashset.add(10);
	    System.out.println("LinkedHashSet created: "+ linkedhashset);


	    //read
  		System.out.println("----------------Read operation---------------");
  		System.out.println("Element 10 is present in Hashset: " + linkedhashset.contains(10));
  		
  		//update
		System.out.println("----------------Update operation----------------");
		linkedhashset.remove(30);
		linkedhashset.add(50);
		System.out.println("Element of hashset after updating element 30 to 50: " + linkedhashset);
  			
		//delete
		System.out.println("----------------Delete operation----------------");
		linkedhashset.remove(10);
		System.out.println("hashset after removing element 10: " + linkedhashset);
  		



	}

}
