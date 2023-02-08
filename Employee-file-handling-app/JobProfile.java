package com.monocept.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class JobProfile {

//	private String jobPosition;
	private ArrayList<Employee> employees;
	private HashMap<String, ArrayList<Employee>> jobMap;
	private HashMap<Integer, ArrayList<Employee>> deptMap;

	public JobProfile(ArrayList<Employee> emppList) {
		super();
		this.employees = emppList;
		this.jobMap = new HashMap<String, ArrayList<Employee>>();
		this.deptMap = new HashMap<Integer, ArrayList<Employee>>();
		groupByJobProfile(emppList, jobMap);
		groupByDeptId(emppList, deptMap);
	}

	private void groupByDeptId(ArrayList<Employee> emppList, HashMap<Integer, ArrayList<Employee>> deptMap) {
		for (Employee employee : employees) {
			int deptid = employee.getDeptid();
			if (deptMap.containsKey(deptid)) {
				ArrayList<Employee> temp = deptMap.get(deptid);
				temp.add(employee);
				deptMap.put(deptid, temp);
			} else {
				ArrayList<Employee> temp = new ArrayList<Employee>();
				temp.add(employee);
				deptMap.put(deptid, temp);
			}
		}

		System.out.println("\nDeptId  :EmployeesNumber ");
		for (Entry<Integer, ArrayList<Employee>> e : deptMap.entrySet())
			System.out.println(e.getKey() + "\t:\t " + e.getValue().size());

	}

	private void groupByJobProfile(ArrayList<Employee> employees, HashMap<String, ArrayList<Employee>> jobMap) {

		for (Employee employee : employees) {
			String jobString = employee.getPosition();
			if (jobMap.containsKey(jobString)) {
				ArrayList<Employee> temp = jobMap.get(jobString);
				temp.add(employee);
				jobMap.put(jobString, temp);
			} else {
				ArrayList<Employee> temp = new ArrayList<Employee>();
				temp.add(employee);
				jobMap.put(jobString, temp);
			}
		}
		System.out.println("Employee grouped by their position: ");
		for (Entry<String, ArrayList<Employee>> e : jobMap.entrySet())
			System.out.println(e.getKey() + ": " + e.getValue());

	}

}
