package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class MainS {
	
	public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> secondL = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            secondL.add(scanner.nextInt());
        }


        System.out.println(StaticLinkedList.reverse(l));
        System.out.println(StaticLinkedList.sort(l));
        System.out.println(StaticLinkedList.merge(l,secondL));
    }

}
