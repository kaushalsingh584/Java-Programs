package com.monocept.model;

import java.util.ArrayList;

public class CustomLinkedList {

	Node node;

	public void add(int num) {
		Node newNode = new Node(num);
		if (node == null)
			node = newNode;
		else {
			Node temNode = node;
			while (temNode != null && temNode.getNext() != null) {

				temNode = temNode.getNext();
			}
			temNode.setNext(newNode);
		}
	}

	public void display() {
		Node tempNode = node;
		while (tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.getNext();
		}
		System.out.println();

	}

	public void remove(int num) {

		// checking if the list is empty
		if (node == null) {
			System.out.println("Underflow: LinkedList is empty");
			return;
		}

		// if the element is present as the first node
		if (node.getData() == num)
			node = node.getNext();
		// if the element is present in mid or last
		else {
			Node tempNode = node;
			int flag = 0;
			// checks if the element is last
			while (tempNode != null && tempNode.getNext() != null) {
				if (tempNode.getNext().getData() == num) {
					if (tempNode.getNext().getNext() != null)
						tempNode.setNext(tempNode.getNext().getNext());
					else
						tempNode.setNext(null);
					flag = 1;
					break;
				}
				tempNode = tempNode.getNext();
			}
			if (flag == 0)
				System.out.println("element does not exist");

		}

	}

	public ArrayList<Integer> iterate() {

		ArrayList<Integer> ll = new ArrayList<Integer>();
		Node tempNode = node;
		while (tempNode != null) {
			ll.add(tempNode.getData());
			tempNode = tempNode.getNext();
		}
		return ll;
	}

}
