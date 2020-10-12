package com.hackerrank.contests;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/strictly-increasing-sequence/problem
 *
 * @author Suryadeepak_Bpl
 *
 */
public class StrictlyIncSequence {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 2, 3, 3 };
		// int[] ar = { 3, 1, 2, 5, 4 };

		List list = IntStream.of(ar).boxed().collect(Collectors.toList());
		System.out.println(whoIsTheWinner(list));

	}

	public static String whoIsTheWinner(List<Integer> arr) {

		// sort
		Collections.sort(arr);
		int numberOfDuplicates = checkForStrictlyIncSeq(arr);

		if (numberOfDuplicates % 2 == 0) {
			return "First";
		} else {
			return "Second";
		}

	}

	private static int checkForStrictlyIncSeq(List<Integer> arr) {

		int numberOfDuplicates = 0;

		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) == arr.get(i + 1)) {
				numberOfDuplicates++;
			}
		}
		return numberOfDuplicates;
	}

}
