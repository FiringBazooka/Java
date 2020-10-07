package com.hackerrank.medium;

/**
 * https://www.hackerrank.com/challenges/the-time-in-words/problem
 *
 * Max score : 25
 *
 * @author Suryadeepak_Bpl
 *
 */
public class TimeInWords {

	public static void main(String[] args) {

		System.out.println(timeInWords(1, 1));

	}

	static String timeInWords(int h, int m) {

		String desc = "";

		if (m > 30) {
			desc = convert(h + 1);
		} else {
			desc = convert(h);
		}

		if (m == 0) {
			return desc + " o' clock";
		} else if (m == 15) {
			return "quarter past " + desc;
		} else if (m == 30) {
			return "half past " + desc;
		} else if (m == 45) {
			return "quarter to " + desc;
		} else if (m == 1) {
			return convert(m) + " minute past " + desc;
		} else if (m < 30) {
			return convert(m) + " minutes past " + desc;
		} else if (m == 59) {
			int m1 = 60 - m;
			return convert(m1) + " minute to " + desc;
		} else {
			int m1 = 60 - m;
			return convert(m1) + " minutes to " + desc;
		}

	}

	private static String convert(int h) {

		switch (h) {

		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		case 20:
			return "twenty";
		case 21:
			return "twenty one";
		case 22:
			return "twenty two";
		case 23:
			return "twenty three";
		case 24:
			return "twenty four";
		case 25:
			return "twenty five";
		case 26:
			return "twenty six";
		case 27:
			return "twenty seven";
		case 28:
			return "twenty eight";
		case 29:
			return "twenty nine";

		default:
			return "";

		}

	}

}
