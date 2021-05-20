package com.techgig;

import java.util.HashMap;
import java.util.Scanner;

public class LightBulbGarland {

	public static void main(String[] args) {

		HashMap<Integer, Integer> mapIndexToFault = new HashMap();
		mapIndexToFault.put(0, 0);
		mapIndexToFault.put(1, 0);
		mapIndexToFault.put(2, 0);
		mapIndexToFault.put(3, 0);

		HashMap<Integer, Character> mapIndexToColour = new HashMap();

		HashMap<Character, Integer> combinedMap = new HashMap();

		String garland = new Scanner(System.in).nextLine();


		int x = 0;
		for (int i = 0; i < garland.length(); i++) {

			if (garland.charAt(i) == '!') {
				mapIndexToFault.put(x, mapIndexToFault.get(x) + 1);
			} else if (mapIndexToColour.get(x) == null) {
				mapIndexToColour.put(x, garland.charAt(i));
			}

			x++;
			if (x == 4) {
				x = 0;
			}
		}

		combinedMap.put(mapIndexToColour.get(0), mapIndexToFault.get(0));
		combinedMap.put(mapIndexToColour.get(1), mapIndexToFault.get(1));
		combinedMap.put(mapIndexToColour.get(2), mapIndexToFault.get(2));
		combinedMap.put(mapIndexToColour.get(3), mapIndexToFault.get(3));

		System.out.println(combinedMap.get('R') + " " + combinedMap.get('B') + " " + combinedMap.get('Y') + " "
				+ combinedMap.get('G'));

	}

}
