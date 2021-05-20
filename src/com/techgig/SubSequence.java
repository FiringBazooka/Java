package com.techgig;

import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String V = sc.nextLine();

		int count = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < count; i++) {
			String B = sc.nextLine();

			int k = 0;
			for (int j = 0; j < V.length(); j++) {

				if (B.charAt(k) == V.charAt(j)) {
					k++;
				}

				if (k == B.length()) {
					System.out.println("POSITIVE");
					break;
				}
			}
			if (k != B.length()) {
				System.out.println("NEGATIVE");
			}
		}

	}

}
