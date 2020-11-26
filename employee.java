package com.buzzfreeze.Homework;

public class employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public employee(int id,String firstName,String lastName,int salary) {
		this.id = id;
//id = idinput
		this.firstName = firstName ;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getID() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getName() {
		String Name = firstName + lastName; 
		return Name;
	}
	public int getsalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		int AnnualSalary = salary*12;
		return AnnualSalary;
	}
	public int raiseSalary(int percent) {
		int Salary = salary*(percent/100) + salary;
				return Salary;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
    	
	
}




