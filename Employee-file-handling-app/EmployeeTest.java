package com.monocept.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.monocept.model.Employee;
import com.monocept.model.JobProfile;

public class EmployeeTest {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		File employeesFile = new File(
				"D:\\Mono_java_04\\java\\34-Employee-file-handling-app\\src\\com\\monocept\\test\\emp.txt");
		
		Scanner scannerEmployees = new Scanner(employeesFile);

		while (scannerEmployees.hasNextLine()) {

			String[] employeeString = scannerEmployees.nextLine().split(",", 0);

			employees.add(new Employee(Integer.parseInt(employeeString[0]), employeeString[1].replace("'", ""),
					employeeString[2].replace("'", ""), Integer.parseInt(employeeString[3].replace("NULL", "0")),
					employeeString[4].replace("'", ""), Integer.parseInt(employeeString[5]),
					Integer.parseInt(employeeString[6].replace("NULL", "0")), Integer.parseInt(employeeString[7])));
		}

		JobProfile jobProfile = new JobProfile(employees);

		Collections.sort(employees);

		System.out.println("\nTop three Employee with the highest salary: ");
		System.out.println(employees.get(1));
		System.out.println(employees.get(2));
		System.out.println(employees.get(3));

	}

}
