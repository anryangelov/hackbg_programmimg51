package com.hackbulgaria.programming51.week3;

public class MainTravel {

	public static void main(String[] args) {
		Employee ivo = new Employee("Ivaylo");
	    Employee rado = new Employee("Rado");
	    Employee ivan = new Employee("Ivan");
	    
	    Travel conf = new Travel("Sofia", "Bulgaria", 20);

	    // for (int i = 1; i < 1000; i += 200) {
	    // 	conf.addExpense( new TravelExpense("Hotel", new Employee("name" + i), i));
	    // }
	    
	    TravelExpense dinnerRado = new TravelExpense("Dinner", rado, 500);
	    TravelExpense dinnerIvo = new TravelExpense("Dinner", ivo, 100);
	    TravelExpense hotelIvo = new TravelExpense("Hotel", ivo, 2000);
	    TravelExpense transportIvo = new TravelExpense("Transport", ivo, 300);
	    TravelExpense hotelIvan = new TravelExpense("Hotel", ivan, 2300);
	    
	    conf.addExpense(dinnerRado);
	    conf.addExpense(dinnerIvo);
	    conf.addExpense(hotelIvo);
	    conf.addExpense(transportIvo);
	    conf.addExpense(hotelIvan);

	    System.out.println(conf.getEmployeeCost(ivan));
	    
	    System.out.println(conf.totalCost()); // 120

	    Employee[] toFire = conf.mostExpensesMadeBy();

	    for(Employee employee: toFire) {
	      System.out.println(employee);
	    }
	    System.out.println(conf);
	}

}
