package com.hackbulgaria.programming51.week1;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(toNumber("1001"));
	}

	public static String toBinary(int n) {

		String res = "";
		while (n > 0) {
			int temp;
			temp = n % 2;
			res = res + temp;
			n = n / 2;
		}
		return res;
	}

	public static int n2(int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * 2;
		}
		return res;
	}

	public static int toNumber(String binary) {
		int res = 0;
		char temp;
		int len = binary.length();
		for (int i = len - 1; i >= 0; i--) {
			temp = binary.charAt(i);
			if (temp == '1') {
				res = res + n2(len -1 - i);
			}
		}
		return res;
	}

	public static int countBits(int n) {
		String bin;
		bin = toBinary(n);
		return bin.length();
	}

	public static boolean isPowerOfTwo(String binary) {
		char temp;
		int count = 0;
		for (int i = 0; i < binary.length(); i++) {
			temp = binary.charAt(i);
			if (temp == '1') {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}
		return false;

	}
}
