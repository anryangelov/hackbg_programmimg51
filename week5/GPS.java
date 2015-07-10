package com.hackbulgaria.programming51.week5;

import java.util.Scanner;
import java.util.Vector;

public class GPS {

	public static Vector<Integer> getGasStations(int tripDistance, int tankSize, Vector<Integer> gasStations) {
		Vector<Integer> res = new Vector<Integer>();
		gasStations.add(tripDistance);
		int lastGasStation = 0;
		for (int i = 0; i < gasStations.size(); i++) {
			if (gasStations.get(i) - lastGasStation > tankSize) {
				res.add(gasStations.get(i - 1));
				lastGasStation = gasStations.get(i - 1);
			}	
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tripDistance = scanner.nextInt();
		int tankSize = scanner.nextInt();

		int gasStationsCount = scanner.nextInt();
		Vector<Integer> gasStations = new Vector<Integer>();

		for (int i = 0; i < gasStationsCount; i++) {
			gasStations.add(scanner.nextInt());
		}

		Vector<Integer> result = getGasStations(tripDistance, tankSize,
				gasStations);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

}
