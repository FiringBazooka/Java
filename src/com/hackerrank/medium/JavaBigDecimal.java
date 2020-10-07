package com.hackerrank.medium;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem
 *
 * Max score : 20
 *
 * @author Suryadeepak_Bpl
 *
 */
public class JavaBigDecimal {

	public static void main(String[] args) {

		// String[] s = { "-100", "50", "0", "56.6", "90", "0.12", ".12",
		// "02.34", "000.000" };
		String[] s = { "0", "00", "0", "0" };

		Map<String, BigDecimal> map = new HashMap();

		Map<String, String> counter = new HashMap();

		for (String string : s) {

			if (string != null) {

				if (map.get(string) != null) {
					String separator = counter.get(string) + "#";

					map.put(string + separator, new BigDecimal(string));
					counter.put(string, separator);

				} else {

					map.put(string, new BigDecimal(string));
					counter.put(string, "");
				}

			}

		}

		List<Map.Entry<String, BigDecimal>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		for (int i = 0; i < s.length; i++) {

			if (s[i] != null) {

				s[i] = list.get(i).getKey().replaceAll("#", "");

			}
		}

		// Output
		for (String element : s) {
			System.out.println(element);
		}

	}

}
