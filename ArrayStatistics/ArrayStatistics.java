package com.monocept.test;

import java.util.Arrays;

public class ArrayStatistics {

	public static void main(String[] args) {

		int size = args.length;
		int sum = 0, ct = 0;
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		double median;
		int array[] = new int[size];

		for (int i = 0; i < args.length; i++) {
			array[i] = Integer.parseInt(args[i]);
			sum += array[i];
			minValue = Math.min(minValue, array[i]);
			maxValue = Math.max(maxValue, array[i]);
		}

		Arrays.sort(array);
		if (size % 2 != 0)
			median = array[size / 2 + 1];
		else
			median = (array[size / 2] + array[size / 2 + 1]) / 2.0;

		System.out.println("Sum of the values is " + sum);
		System.out.println("Average of the values is " + sum / (float) size);
		System.out.println("Min value of the values is " + minValue);
		System.out.println("Max value of the values is " + maxValue);
		System.out.println("Median of the values is " + median);

		int curr = array[0];
		for (int i = 0; i < size; i++) {
			if (curr == array[i])
				ct++;
			else {
				{
					System.out.println("Frequency of " + curr + " is " + ct + " times");
					ct = 1;
					curr = array[i];
				}
			}
		}
		
		System.out.println("Frequency of " + curr + " is " + ct + " times");
	}

}
