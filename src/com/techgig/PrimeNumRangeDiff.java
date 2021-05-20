package com.techgig;

import java.util.Scanner;

public class PrimeNumRangeDiff {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < count; i++) {

			String[] range = sc.nextLine().split(" ");
			int a = Integer.parseInt(range[0]);
			int b = Integer.parseInt(range[1]);

			if (a == b) {
				System.out.println(0);
				continue;
			}

			int z = a;
			int min = 0, max = 0;

			while (z <= b && min == 0) {

				if (z == 1) {
					z++;
					continue;
				} else if (z == 2) {
					min = 2;
					break;
				}

				int x = z;

				int m = 0;

				for (int j = 2; j < x; j++) {
					if (x % j == 0) {
						m++;
						break;
					}

				}
				if (m == 0) {
					min = z;
				}
				z++;
			}

			z = b;
			while (z >= min && max == 0 && min != 0) {
				int x = z;

				int m = 0;

				for (int j = 2; j < x; j++) {
					if (x % j == 0) {
						m++;
						break;
					}

				}
				if (m == 0) {
					max = z;
				}
				z--;
			}

			if (min == 0) {
				System.out.println(-1);
			} else {
				System.out.println(max - min);
			}
		}

	}

}
