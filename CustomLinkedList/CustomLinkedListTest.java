package com.monocept.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.monocept.model.CustomLinkedList;

public class CustomLinkedListTest {

	public static void main(String[] args) {

		CustomLinkedList list = new CustomLinkedList();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to add value to LinkedList");
			System.out.println("Enter 2 to remove value to LinkedList");
			System.out.println("Enter 3 to display value of LinkedList");
			System.out.println("Enter 4 to iterate through LinkedList");
			System.out.println("Enter 5 to end");
			System.out.println("\nEnter the response");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter value to add to the linkedList");
				int num = scanner.nextInt();
				list.add(num);
				break;
			case 2:
				System.out.println("Enter value to remove element from the linkedList");
				list.remove(scanner.nextInt());

				break;
			case 3:
				System.out.println(list.display());
				break;
			case 4:
				LinkedList<Integer> temporaryList = list.display();
				for(int item :temporaryList)
					 System.out.println(item);
				break;
			case 5:
				flag = false;
				System.out.println("End !!!");
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		
	}

}
