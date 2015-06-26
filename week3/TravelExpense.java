package com.hackbulgaria.programming51.week3;

public class TravelExpense {

	private String type = "";
	private Employee employee;
	private int cost = 0;
	
	public TravelExpense(String type, Employee employee, int cost) {
		this.type = type;
		this.employee = employee;
		this.cost = cost;
	}
	
	public String toString() {
		return  type + " " + employee + " " + cost;
	}
	
	public String getType() {
		return type;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public int getNetCost() {
		return cost;
	}
}
