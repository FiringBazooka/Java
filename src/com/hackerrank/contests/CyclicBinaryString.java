package com.hackerrank.contests;

/**
 * https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/cyclic-binary-string
 *
 * @author Suryadeepak_Bpl
 *
 */
public class CyclicBinaryString {

	public static void main(String[] args) {

		System.out.println(maximumPower("1001"));
		System.out.println(maximumPower("1011010"));

	}

	public static int maximumPower(String s) {

		int max = 0;
		int length = s.length();

		while (length > 0) {

			double value = calculateValue(s);
			int powerOfTwo = calculatePowerOfTwo(value);

			if (powerOfTwo > max) {
				max = powerOfTwo;
			}

			char lastChar = s.charAt(s.length() - 1);
			String sub = s.substring(0, s.length() - 1);
			s = lastChar + sub;
			length--;

		}

		return max;

	}

	private static int calculatePowerOfTwo(double value) {

		int count = 0;
		while (value % 2 == 0) {
			count++;
			value = value / 2;
		}
		return count;

	}

	private static double calculateValue(String s) {

		double sum = 0;
		int pos = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			sum = sum + Integer.parseInt(s.charAt(i) + "") * Math.pow(2, pos);
			pos++;

		}
		return sum;

	}

}
