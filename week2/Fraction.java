package com.hackbulgaria.programming51.week2;

public class Fraction {
	
	public int numerator;
	public int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public float getReal() {
		
		return (float) numerator / (float) denominator;
	}
	
	public void sum(Fraction fraction) {
		if (denominator != fraction.denominator) {
			if (denominator % fraction.denominator == 0) {
				numerator = numerator + ((denominator / fraction.denominator) * fraction.numerator);
			} else if (fraction.denominator % denominator == 0) {
				numerator = fraction.numerator + ((fraction.denominator / denominator) * numerator);
				denominator = fraction.denominator;
			} else {
				int new_denominator = denominator * fraction.denominator;
				numerator = ((new_denominator/denominator) * numerator) + 
					((new_denominator/fraction.denominator) * fraction.numerator);
			    denominator = new_denominator;
			}
		} else {
			numerator = numerator + fraction.numerator;
		}
	}
	
	public void simplify() {
		int until;
		// take smaller value from numerator and denominator
		if (numerator > denominator) { 
			until = denominator;
		} else until = numerator;
		
		for (int i = 2; i <= until; i++ ) {
			if (numerator % i == 0 && denominator % i == 0) {
				numerator = numerator / i;
				denominator = denominator / i;
			}
		}
	}
	
	public String toString () {
		return numerator + "/" + denominator;
	}
		
	public static void main(String[] args) {
		
		Fraction f = new Fraction(11,33);
		Fraction f2 = new Fraction(4,5);

		
		System.out.println("getReal: " + f.getReal());
		System.out.println("toString: " + f);
		f.simplify();
		System.out.println("Simplify: " + f);
		f.sum(f2);
		System.out.println("sum: " + f);
	}
}
