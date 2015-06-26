package com.hackbulgaria.programming51.week3;

public class Travel {
	
	public String country = "";
	public String city = "";
	public int VAT = 0;
	private TravelExpenseVector expenses = new TravelExpenseVector();
	private Employee [] employees = new Employee[10];
	private int [] costs = new int[10]; 
	private int countExpenses = 0;
	
	public Travel(String city, String country, int VAT) {
		this.country = country;
		this.city = city;
		this.VAT = VAT;
	}
	
	public String toString () {
		String res = "";
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) break;
			res += employees[i] + ": " + costs[i] + "\n";
		}
		return res;
	}
	
	public void addExpense(TravelExpense expense) {
		expenses.Add(expense);
		countExpenses++;
		addEmployeeAndCost(expense.getEmployee(), expense.getNetCost());
	}
	
	public int totalNetCost() {
		int sum = 0; 
		for (int i = 0; i < expenses.size(); i++) {
			if (expenses.get(i) == null) break;
			sum += expenses.get(i).getNetCost();
		}
		return sum;
	}
	
	public int totalCost () {
		int netCost = totalNetCost();
		return (netCost * VAT)/100 + netCost;
	}
	
	public Employee [] mostExpensesMadeBy() {
		Employee [] res = new Employee[2];
		SortMostExpenseve();
		for (int i=0; i < employees.length; i++) {
			if (i > 1) break;
			res[i] = employees[i];
		}
		return res;
	}
	
	private void SortMostExpenseve() {
		for (int i = 0; i < employees.length; i++) {
			int temp = i;
			for (int j = i; j < employees.length; j++) {
				if (costs[j] > costs[temp]) {
					temp = j;
				}
			}
			int cost = costs[i];
			Employee employee = employees[i];
			costs[i] = costs[temp];
			employees[i] = employees[temp];
			costs[temp] = cost;
			employees[temp] = employee; 	
		}
	}
	
	public int getEmployeeCost(Employee employee) {
		for (int i=0; i < employees.length; i++) {
			if (employees[i] == employee) {
				return costs[i];
			}
			if (employees[i] == null) return -1;
		}
		return -1;
	}
	
	private void addEmployeeAndCost(Employee employee, int cost) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = employee;
				costs[i] = cost;
				return;
			}
			if (employees[i] == employee) {
				costs[i] += cost;
				return;
			}
		}
	}
}
