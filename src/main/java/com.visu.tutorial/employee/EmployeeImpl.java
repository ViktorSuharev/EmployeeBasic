package com.visu.tutorial.employee;

public class EmployeeImpl implements Employee {
	private static final String NO_MANAGER = "No manager";

	private int salary;
	private String name;
	private String surname;
	private Employee chief;
	
	EmployeeImpl(int value, String firstName, String secondName){
		salary = value;
		name = firstName;
		surname = secondName;
	}
	
	EmployeeImpl(){
		salary = 1000;
		name = "Ivan";
		surname = "Ivanov";
	}
	
	
	public int getSalary(){
		return salary;
	}
	
	public void setSalary(int value){
		salary = value;
	}
	
	public void increaseSalary(int value){
		salary += value;
	}
	
	public String getFirstName(){
		return name;
	}
	
	public void setFirstName(String firstName){
		name = firstName;
	}
	
	public String getLastName(){
		return surname;
	}
	
	public void setLastName(String lastName){
		surname = lastName;
	}
	
	public String getFullName(){
		return name + " " + surname;
	}
	

	public void setManager(Employee manager){
		chief = manager;
	}
	
	public String getManagerName(){
		return chief == null ? NO_MANAGER : chief.getFullName();
	}

	public Employee getTopManager(){
		return this.getManagerName().equals(NO_MANAGER) ? this : chief.getTopManager();
	}
}