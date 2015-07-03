package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class VectorOfVectors {
	
	public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
        // TODO: add implementation here
		Vector<Integer> res = new Vector<Integer>();
		for (Vector<Integer> inV: v) {
			for (Integer i: inV) {
				if (! res.contains(i)) res.add(i);
			}
		}
		res.sort(null);
		return res;
    }

    public static void main(String[] args) {

        Vector<Vector<Integer>> vi = new Vector<Vector<Integer>>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Vector<Integer> v = new Vector<Integer>();
            int num = scanner.nextInt();
            for (int k = 0; k < num; k++) {
                v.add(scanner.nextInt());
            }
            vi.add(v);
        }
        System.out.println(sortAndUnique(vi));
    }


}
