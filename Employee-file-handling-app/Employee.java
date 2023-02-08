package com.monocept.model;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String name;
	private String position;
	private int managerid;
	private String dob;
	private int salary;
	private int commission;
	private int deptid;

	public Employee(int empid, String name, String position, int managerid, String dob, int salary, int commission,
			int deptid) {
		super();
		this.empid = empid;
		this.name = name;
		this.position = position;
		this.managerid = managerid;
		this.dob = dob;
		this.salary = salary;
		this.commission = commission;
		this.deptid = deptid;

	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	
	@Override
	public String toString() {
		return "\nEmployee [empid=" + empid + ", name=" + name + ", position=" + position+" salary="+salary+ "]";
	}

	@Override
	public int compareTo(Employee obj) {
		return  obj.getSalary()-this.salary ;
	}

}
