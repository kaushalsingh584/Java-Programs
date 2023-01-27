package com.monocept.test;

public class LongestSequenceCharaters {

	public static void main(String[] args) {

		int size = args.length;
		int ct = 1, maxl = 0;
		int arr[] = new int[size];
		int prev = Integer.parseInt(args[0]);
		for (int i = 1; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
			if (arr[i] == prev) {
				ct++;
				maxl = Math.max(maxl, ct);
			} else {
				ct = 1;
			}
			prev = arr[i];

		}
		maxl = Math.max(maxl, ct);
		System.out.println("The longest sequence of characters is " + maxl);
	}

}
