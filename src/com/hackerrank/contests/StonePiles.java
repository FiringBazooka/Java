package com.hackerrank.contests;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/stones-piles/problem
 *
 * Max score:10
 *
 * @author Suryadeepak_Bpl
 *
 */
public class StonePiles {

	public static void main(String[] args) {

		int[] ar = { 5, 1, 1, 4 };
		List<Integer> list = IntStream.of(ar).boxed().collect(Collectors.toList());
		System.out.println(maximumStones(list));

	}

	public static int maximumStones(List<Integer> arr) {

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + arr.get(i);
			} else {
				sum2 = sum2 + arr.get(i);
			}
		}

		return sum1 > sum2 ? 2 * sum2 : 2 * sum1;

	}

}
