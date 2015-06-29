package com.hackbulgaria.programming51.week3;

public class IntegerVectorStatic {
	
	public static String toString(IntegerVector v) {
		String res = "";
		if (v.size() > 0) {
			for (int i = 0; i < v.size() - 1; i++) {
				res += v.get(i) + ", ";
			}
			res += v.get(v.size() - 1);
		}
		return res;
	}
	
	public static void sort(IntegerVector v) {
		for (int i = 0; i < v.size(); i++) {
			int temp = i;
			for (int j = i; j < v.size(); j++) {
				if (v.get(j) < v.get(temp)) {
					temp = j;
				}
			}
			v.replace(i, temp);
		}
	}
	
	public static IntegerVector reverse(IntegerVector v) {
		IntegerVector res = new IntegerVector();
		for (int i = 0; i < v.size(); i++) {
			res.insert(0, v.get(i)); 
		}
		return res;
	}
	
	public static String join(IntegerVector v, String glue) {
		String res = "";
		if (v.size() > 0) {
			for (int i = 0; i < v.size() - 1; i++) {
				res += v.get(i) + glue;
			}
			res += v.get(v.size() - 1);
		}
		return res;
	}
	
	public static IntegerVector range(int a, int b) {
		IntegerVector res = new IntegerVector();
		for (int i = a; i < b; i++) {
			res.add(i);
		}
		return res;
	}

	public static IntegerVector filterOdd(IntegerVector v) {
		IntegerVector res = new IntegerVector();
		for (int i = 0; i < v.size(); i++){
			if (v.get(i) % 2 == 1) {
				res.add(v.get(i));
			}
		}
		return res;
	}
	
	public static int sum(IntegerVector v) {
		int res = 0;
		for (int i = 0; i < v.size(); i++) {
			res += v.get(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		IntegerVector data = new IntegerVector();
		data.add(100);
		int len = 4;
		for (int i = 0; i < len; i++) {
			data.add(i);
		}
		data.add(-2);
		String res = IntegerVectorStatic.toString(data);
		System.out.println(res);
		IntegerVectorStatic.sort(data);
		System.out.println(IntegerVectorStatic.toString(data));
		IntegerVector r = IntegerVectorStatic.reverse(data);
		System.out.println(IntegerVectorStatic.toString(r));
		System.out.println(IntegerVectorStatic.join(data, "->"));
		System.out.println(IntegerVectorStatic.range(10, 20));
		IntegerVector temp = IntegerVectorStatic.filterOdd(data);
		System.out.println(temp);
		System.out.println(IntegerVectorStatic.sum(data));
	}
}
