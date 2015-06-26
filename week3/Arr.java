package com.hackbulgaria.programming51.week3;

public class Arr {
	  public static String toString(int[] a) {
		  String res = "";
		  for (int i=0; i < a.length; i++ ) {
			  res += a[i] + ", ";
		  }
		  if (res.length() > 2) {
			  res = res.substring(0, res.length() - 2);
		  } else {
			  res = "";
		  }
		  return res;
	  }
	  
	  public static void sort(int[] a) {
		  for (int i=0; i < a.length; i++) {
			  int temp = i;
			  for (int j=i; j < a.length; j++ ) {
				  if (a[j] < a[temp]) {
					  temp = j;
				  }
			  }
			 int value = a[i]; 
			 a[i] = a[temp];
			 a[temp] = value;
		  }
	  }
	  
	  public static int[] reverse(int[] a) {
		  int [] res = new int[a.length];
		  for (int i=0; i < a.length; i++) {
			  res[i] = a[a.length - 1 - i];
		  }
		  return res;
	  }
	  
	  public static String join(int[] a, String glue) {
		  String res = "";
		  for (int i=0; i < a.length - 1 ; i++) {
			  res += a[i] + glue;
		  }
		  res += a[a.length - 1];
		  return res;
	  }
	  
	  public static int sum(int[] a) {
		  int res = 0;
		  for (int temp: a) {
			  res += temp;
		  }
		  return res;
	  }
	  
	  public static int[] range(int a, int b) {
		  int [] res = new int[Math.abs(b - a)];
		  for (int i=a; i <= res.length; i++) {
			  res[i-a] = i;
		  }
		  return res;
	  }
	  
	  public static int[] filterOdd(int[] a) {
		  int size = 0;
		  for (int temp: a) {
			  if (Math.abs(temp % 2) == 1) size++;
		  }
		  int [] res = new int[size];
		  int index = 0;
		  for (int i=0; i < a.length; i++) {
			  if (Math.abs(a[i] % 2) == 1) res[index++] = a[i]; 
		  }
		  return res;
	  }
	  
	  public static void main(String[] args) {
	    int[] a = {10, 20, -50, 80, 70, 66, -365};

	    System.out.println("Print the array to string:");
	    System.out.println(Arr.toString(a));
	    
	    System.out.println("Sort the array a itself and print it sorted:");
	    Arr.sort(a);
	    System.out.println(Arr.toString(a));
	    
	    
	    System.out.println("Print the reverse of the sorted array");
	    System.out.println(Arr.toString(Arr.reverse(a)));
	    
	    System.out.println("Output each element in a with -> between them");
	    System.out.println(Arr.join(a, "->"));
	    
	    System.out.println("Output the sum");
	    System.out.println(Arr.sum(a));
	    
	    System.out.println("Output array with elements from 1 to 10");
	    System.out.println(Arr.toString(Arr.range(1, 10)));
	    
	    System.out.println("Print only the odd numbers");
	    System.out.println(Arr.toString(Arr.filterOdd(a)));
	  }
	}