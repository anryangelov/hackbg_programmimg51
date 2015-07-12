package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Integer [] arr;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list1.addLast(scanner.nextInt());
        }
        n = scanner.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        list2.addArray(arr);
        list1.insertListBefore(0, list2);
        list1.insertListAfter(0, list2);

        System.out.println(list1);
        scanner.close();
    }

}
