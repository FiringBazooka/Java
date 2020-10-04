package com.hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://www.hackerrank.com/contests/hack-the-interview-vi/challenges/maximum-sum-10-1/problem
 * Max score : 10
 *
 * @author Suryadeepak_Bpl
 *
 */
public class ArraySumOperation {

	public static void main(String[] args) {

		List<Integer> op = new ArrayList<Integer>() {
			{
				add(4);
				add(2);
			}
		};
		System.out.println(performOperations(3, op));

	}

	public static List<Long> performOperations(int N, List<Integer> op) {

		// form the N array

		int[] list = new int[N];
		int i = 1;
		long sum = 0;
		while (i <= N) {

			list[i - 1] = i;
			sum = sum + i;
			i++;
		}

		List<Long> sumList = new ArrayList<>();

		// for M operations
		for (Integer m : op) {

			if (present(list, m)) {
				int temp = list[0];
				list[0] = list[N - 1];
				list[N - 1] = temp;

			} else {
				sum = sum - list[N - 1] + m;
				list[N - 1] = m;

			}

			sumList.add(sum);
		}

		return sumList;

	}

	private static boolean present(int[] list, Integer m) {

		for (int i : list) {
			if (i == m) {
				return true;
			}
		}

		return false;
	}

}
