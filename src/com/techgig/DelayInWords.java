package com.techgig;

import java.util.Scanner;

public class DelayInWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int delay = Integer.parseInt(sc.nextLine());
		int count = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		int result = 1;

		System.out.println(delay+" "+count+" "+y);
		for (int i = 1; i < count; i++) {
			int z = Integer.parseInt(sc.nextLine());
			if (z - y > delay) {
				result = 1;
			} else {
				result = result + 1;
			}
			y = z;
		}
		System.out.println(result);
	}

}
