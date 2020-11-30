package com.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private LocalDate dob;
	public Employee(int id, String name, double salary, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static List<Employee> loadEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(12, "John", 10000, LocalDate.parse("2020-11-11")));
		employees.add(new Employee(34, "Kiran", 20000, LocalDate.parse("2020-12-12")));
		employees.add(new Employee(95, "Varun", 30000, LocalDate.parse("2020-11-19")));
		employees.add(new Employee(76, "Tara", 40000, LocalDate.parse("2020-11-27")));
		employees.add(new Employee(16, "Kumar", 50000, LocalDate.parse("2020-10-18")));
		return employees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
	}
	
}
