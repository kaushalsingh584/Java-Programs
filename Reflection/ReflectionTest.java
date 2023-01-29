package com.monocept.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c1 = Class.forName("java.lang." + args[0]);
			Field[] fields = c1.getDeclaredFields();
			Method[] methods = c1.getMethods();
			Constructor[] constructors = c1.getConstructors();
			System.out.println("Fields: ");
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}
			System.out.println("Methods: ");
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);

			}
			System.out.println("Constructors: ");
			for (int i = 0; i < constructors.length; i++) {
				System.out.println(constructors[i]);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
