package com.hackerrank.contests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/rbg
 *
 * @author Suryadeepak_Bpl
 *
 */
public class RBGQueries {

	public static void main(String[] args) {

		int[] a1 = { 1, 1, 1, };
		int[] a2 = { 0, 0, 2 };
		int[] a3 = { 5, 0, 0 };
		int[] a4 = { 5, 2, 2 };

		List l1 = IntStream.of(a1).boxed().collect(Collectors.toList());
		List l2 = IntStream.of(a2).boxed().collect(Collectors.toList());
		List l3 = IntStream.of(a3).boxed().collect(Collectors.toList());
		List l4 = IntStream.of(a4).boxed().collect(Collectors.toList());
		List colors = new ArrayList();
		colors.add(l1);
		colors.add(l2);
		colors.add(l3);
		colors.add(l4);

		int[] b1 = { 0, 0, 2 };
		int[] b2 = { 5, 1, 2 };
		int[] b3 = { 5, 3, 2 };

		List m1 = IntStream.of(b1).boxed().collect(Collectors.toList());
		List m2 = IntStream.of(b2).boxed().collect(Collectors.toList());
		List m3 = IntStream.of(b3).boxed().collect(Collectors.toList());
		List queries = new ArrayList();
		queries.add(m1);
		queries.add(m2);
		queries.add(m3);

		System.out.println(mixColors(colors, queries));

	}

	public static List<String> mixColors(List<List<Integer>> colors, List<List<Integer>> queries) {

		int i = 0, j = 0, k = 0, count = 0;

		List<String> result = new ArrayList();

		while (i < queries.size()) {

			List<List<Integer>> list = new ArrayList<>();

			j = 0;
			while (j < queries.get(i).size()) {
				int target = queries.get(i).get(j);
				// System.out.println("QUERY: " + queries.get(i));
				// System.out.println("TARGET: " + target);
				k = 0;

				while (k < colors.size()) {
					// System.out.println("COLOR LIST: " + colors.get(k));
					// System.out.println("COLOR VALUE: " +
					// colors.get(k).get(j));
					// System.out.println("PRESENT: " +
					// list.contains(colors.get(k)));

					if (j == 0 && colors.get(k).get(j) <= target && !list.contains(colors.get(k))) {
						list.add(colors.get(k));

					} else if (colors.get(k).get(j) > target && list.contains(colors.get(k))) {
						list.remove(colors.get(k));
					}

					if (colors.get(k).get(j) == target) {
						count++;
					}

					if (count == 0 && k == colors.size() - 1) {
						list.removeAll(colors);
					}

					k++;
					// System.out.println("LIST: " + list);
				}
				j++;
				count = 0;
			}
			i++;
			if (list.size() > 0) {
				result.add("YES");

			} else {
				result.add("NO");
			}
			// System.out.println("RESULT: " + result);
		}
		return result;

	}

}
