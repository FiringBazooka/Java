package com.hackerrank.medium;

/**
 * https://www.hackerrank.com/challenges/bigger-is-greater/problem
 *
 * Max score : 35
 *
 *
 */
public class BiggerIsGreater {

	public static void main(String[] args) {

		String w = "hefg";
		w = "dkhc";
		w = "bb";
		w = "dcba";
		w = "acdb";
		w = "dcbb";
		w = "ab";
		w = "hlvpzsfwnzsazeyaxaczkkrstiilkldupsqmzjnnsyoao";

		System.out.println("ANSWER >>>> " + biggerIsGreater(w));

	}

	private static String biggerIsGreater(String w) {

		// length =1
		if (w.length() == 1) {
			return "no answer";

		}

		// palindrome
		String reveresedString = new StringBuilder(w).reverse().toString();
		if (reveresedString.equals(w)) {
			return "no answer";

		}

		int count = 0;
		boolean perfect = true;

		for (int i = w.length() - 2; i >= 0; i--) {

			int iAscii = w.charAt(i);
			int from = i;
			int fr = from;
			int toAscii = 200;
			int to = i + 1;
			String swappedString = w;

			System.out.println(w.charAt(i));

			for (int j = i + 1; j < w.length(); j++) {

				int jAscii = w.charAt(j);
				System.out.println(w.charAt(j));

				if (jAscii > iAscii && jAscii < toAscii) {

					toAscii = jAscii;
					fr = from;
					to = j;
					perfect = false;

					if (j == w.length() - 1) {
						swappedString = swap(w, fr, to);
						count++;
						break;
					}
				}

				if (j == w.length() - 1 && !perfect && count == 0) {
					swappedString = swap(w, fr, to);
					count++;

				}

			}

			if (count > 0) {
				System.out.println(swappedString);
				return reorder(swappedString, from);

			} else if (count == 0 && i == 0) {

				if (perfect) {
					return "no answer";

				}

				swappedString = swap(w, from, to);
				System.out.println(swappedString);

				return reorder(swappedString, from);

			}

		}

		return "";

	}

	private static String reorder(String swappedString, int from) {

		// System.out.println(swappedString);

		String toReorder = swappedString.substring(from + 1, swappedString.length());
		String[] x = toReorder.split("");

		for (int r = 0; r < x.length - 1; r++) {

			for (int t = r + 1; t < x.length; t++) {

				if (toReorder.charAt(t) < toReorder.charAt(r)) {
					toReorder = swap(toReorder, r, t);

				}
			}
		}

		String finalWord = swappedString.substring(0, from + 1) + toReorder;
		System.out.println(finalWord);
		return finalWord;

	}

	private static String swap(String w, int i, int j) {

		return w.substring(0, i) + w.charAt(j) + w.substring(i + 1, j) + w.charAt(i) + w.substring(j + 1, w.length());

	}

}
