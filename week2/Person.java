package com.hackbulgaria.programming51.week2;

public class Person {
	
	public String firstName = "";
	public String lastName = "";
	public int age = 0;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String toString() {
		return firstName + "(" + age + ")"; 
	}
}

	