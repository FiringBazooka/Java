import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class arrays {

	public static void main(String[] args) throws InterruptedException, ParseException {
		int[] ar = { 769082435, 210437958, 673982045, 375809214, 380564127 };

		List<Integer> list = IntStream.of(ar).boxed().collect(Collectors.toList());
		Collections.sort(list);

		long min = (long) list.get(0) + (long) list.get(1) + (long) list.get(2) + (long) list.get(3);
		long max = (long) list.get(1) + (long) list.get(2) + (long) list.get(3) + (long) list.get(4);

		System.out.println(min + " " + max);
		System.out.println(timeConversion("07:05:45PM"));
		plusMinus();
		printLadder(4);
		getMoneySpent();
		System.out.println(catAndMouse(1, 2, 3));
		System.out.println(catAndMouse(1, 3, 2));
		// cavityMap();
		gradingStudents();
		countApplesAndOranges();
		kangaroo();
		getTotalX();
		breakingRecords();
		birthday();
		divisibleSumPairs();
		migratoryBirds();
		dayOfProgrammer();
		bonAppetit();
		pageCount();
		designerPdfViewer();
		extraLongFactorials();
		encryption();
	}

	static String timeConversion(String s) {

		try {
			return new SimpleDateFormat("HH:mm:ss").format(new SimpleDateFormat("hh:mm:ssa").parse(s));
		} catch (ParseException e) {

		}
		return null;
		// System.out.println(LocalTime.f);

	}

	static void plusMinus() {

		int[] ar = { -4, 3, -9, 0, 4, 1 };

		int x = ar.length;
		float pos = 0, neg = 0, zero = 0;

		for (int i : ar) {

			if (i > 0) {
				pos++;
			} else if (i == 0) {
				zero++;
			} else {
				neg++;
			}
		}

		DecimalFormat f = new DecimalFormat();
		f.setMinimumFractionDigits(6);
		System.out.println(f.format(pos / x));
		System.out.println(f.format(neg / x));
		System.out.println(f.format(zero / x));

	}

	static void printLadder(int n) {

		int first = n * 2 - 1;
		String a = "#";
		while (a.length() <= first) {
			System.out.printf("%" + first + "s\n", a);
			a = a + " " + "#";
		}
	}

	static void getMoneySpent() {

		int b = 10;
		int[] keyboards = { 3, 1 };
		int[] drives = { 5, 2, 8 };

		int max = -1;

		for (int i : keyboards) {

			for (int j : drives) {

				int sum = i + j;

				if (sum < b && sum > max) {
					max = sum;
				}

			}

		}
		System.out.println(max);

	}

	static String catAndMouse(int x, int y, int z) {

		String a = "Mouse C";
		if (Math.abs(x - z) > Math.abs(y - z)) {
			return "Cat B";
		} else if (Math.abs(x - z) > Math.abs(y - z)) {
			return "Cat A";
		} else {
			return "Mouse C";
		}

	}

	static void cavityMap() {

		String[] grid = { "989", "191", "111" };

		int s = grid.length;
		int[][] m = new int[s][s];

		for (int i = 0; i < s; i++) {
			String[] arr = grid[i].split("");

			int j = 0;
			while (j < s) {
				m[i][j] = Integer.parseInt(arr[j]);
				j++;
			}
		}

		for (int k = 0; k < s; k++) {

			int j = 0;

			while (j < s) {
				if (k == 0 || k == s - 1 || j == 0 || j == s - 1) {
					System.out.print(m[k][j]);
					j++;
					continue;
				}

				if (m[k][j] > m[k - 1][j] && m[k][j] > m[k + 1][j] && m[k][j] > m[k][j - 1] && m[k][j] > m[k][j + 1]) {
					System.out.print("X");
				} else {
					System.out.print(m[k][j]);
				}
			}
			System.out.println("");

		}

	}

	public static void gradingStudents() {

		System.out.println("");
		System.out.println("<<<< grading students >>>>");

		List<Integer> grades = new ArrayList<Integer>() {

			{
				add(73);
				add(67);
				add(38);
				add(33);
			}
		};

		for (Integer x : grades) {

			int a = 0;

			if (x < 38) {
				System.out.println(x);

			} else if ((a = x + 1) % 5 == 0 || (a = x + 2) % 5 == 0 || (a = x) % 5 == 0) {
				System.out.println(a);

			} else {
				System.out.println(x);
			}
		}

	}

	static void countApplesAndOranges() {

		int s = 7, t = 10, a = 4, b = 12;
		int[] apples = { 2, 3, -4 };
		int[] oranges = { 3, -2, -4 };

		int x = 0, y = 0;
		for (int apple : apples) {
			if (apple + a >= s && apple + a <= t) {
				x++;
			}
		}

		for (int orange : oranges) {
			if (orange + b >= s && orange + b <= t) {
				y++;
			}
		}
		System.out.println(x);
		System.out.println(y);
	}

	static void kangaroo() {

		int x1 = 4523, v1 = 8092, x2 = 9419, v2 = 8076, a = 0, b = 0, c = 0;

		while (a <= 999999999 && b <= 999999999) {

			if ((a = x1 + v1) == (b = x2 + v2)) {
				System.out.println("YES");
				c++;
				break;
			}
			x1 = a;
			x2 = b;
		}
		if (c == 0) {
			System.out.println("NO");
		}

	}

	public static void getTotalX() {

		List<Integer> a = new ArrayList<Integer>() {
			{
				add(2);
				add(4);
			}
		};
		List<Integer> b = new ArrayList<Integer>() {
			{
				add(16);
				add(32);
				add(96);

			}
		};

		Collections.sort(a);
		Collections.sort(b);

		int count = 0;

		for (int i = a.get(a.size() - 1); i <= b.get(0); i++) {

			int bCount = 0, aCount = 0;

			for (Integer bb : b) {

				if (bb % i == 0) {
					bCount++;
				} else {
					break;
				}
			}

			if (bCount == b.size()) {
				for (Integer aa : a) {

					if (i % aa == 0) {
						aCount++;
					}
				}

				if (aCount == a.size()) {
					count++;
				}
			}

		}
		System.out.println(count);

	}

	static void breakingRecords() {

		int[] scores = { 10, 5, 20, 20, 4, 5, 2, 25, 1 };

		int minCount = 0, maxCount = 0;
		int min = 0, max = 0;

		for (int i = 0; i < scores.length; i++) {

			if (i == 0) {
				min = scores[i];
				max = scores[i];
			} else if (scores[i] > max) {
				maxCount++;
				max = scores[i];
			} else if (scores[i] < min) {
				minCount++;
				min = scores[i];
			}

		}
		System.out.print(maxCount + " " + minCount);
		System.out.println("");

	}

	// Complete the birthday function below.
	static void birthday() {

		List<Integer> s = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(1);
				add(3);
				add(2);
			}
		};
		int d = 3, m = 2, count = 0;

		for (int i = 0; i < s.size() - m + 1; i++) {

			int x = 0, j = i;

			while (j <= m + i - 1) {
				x = x + s.get(j);
				j++;
			}

			if (x == d) {
				count++;
			}
		}
		System.out.println(count);

	}

	static void divisibleSumPairs() {

		int ar[] = { 1, 3, 2, 6, 1, 2 };
		int k = 3;

		int count = 0;

		for (int i = 0; i < ar.length - 1; i++) {

			for (int j = i + 1; j < ar.length; j++) {

				if ((ar[i] + ar[j]) % 3 == 0) {
					count++;
				}

			}

		}

		System.out.println(count);

	}

	static void migratoryBirds() {

		List<Integer> arr = new ArrayList<Integer>() {
			{
				add(1);
				add(4);
				add(4);
				add(4);
				add(5);
				add(3);
			}

		};

		Collections.sort(arr);

		int base = 0, count = 0, counter = 0, output = 0, x = 0;

		for (Integer i : arr) {

			if (base == 0) {
				base = i;
				count++;
				x = 0;
			} else if (base == i && counter == 0) {
				count++;
				x = 0;
			} else if (base == i) {
				counter++;
				x = 0;
			} else {
				x = 1;
				if (count < counter) {
					count = counter;
					output = base;
				} else if (count == counter && output > base) {
					output = base;
				}
				base = i;
				counter = 1;

			}
		}

		if (x == 0 && counter != 0) {

			if (count < counter) {
				output = base;
			} else if (count == counter && output > base) {
				output = base;
			}

		} else if (x == 0) {
			output = base;
		}

		System.out.println(output);

	}

	static void dayOfProgrammer() {

		int year = 2017;

		if (year <= 1917) {

			if (year % 4 == 0) {
				System.out.println("12.09." + year);
			} else {
				System.out.println("13.09." + year);
			}

		} else if (year == 1917) {

			System.out.println("26.09.1917");

		} else {

			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				System.out.println("12.09." + year);
			} else {
				System.out.println("13.09." + year);
			}

		}

	}

	static void bonAppetit() {

		List<Integer> bill = new ArrayList<Integer>() {
			{
				add(3);
				add(10);
				add(2);
				add(9);

			}

		};

		int k = 1, b = 12;

		int sum = 0;

		for (int i = 0; i < bill.size(); i++) {

			if (i == k) {
				continue;
			}

			sum = sum + bill.get(i);
		}

		if (sum / 2 == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - sum / 2);
		}

	}

	static void pageCount() {

		int n = 6;
		int p = 3;

		int fflip = 0, bflip = 0;
		if (p == 1 || p == n) {
			System.out.println(0);
		} else if (n % 2 != 0 && p == n - 1) {
			System.out.println(0);
		} else {

			int a = 2;
			while (a <= p) {

				fflip++;
				a++;
				a++;
			}

			if (n % 2 != 0) {

				a = n - 2;
				while (a >= p) {
					bflip++;
					a--;
					a--;
				}

			} else {

				a = n - 1;
				while (a >= p) {
					bflip++;
					a--;
					a--;
				}

			}

			System.out.println(fflip < bflip ? fflip : bflip);
		}

	}

	static int designerPdfViewer() {

		int h[] = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		String word = "abc";

		int height = 1;
		for (int i = 0; i < word.length(); i++) {

			int ht = h[word.charAt(i) - 97];
			if (ht > height) {
				height = ht;
			}
		}

		return word.length() * height;

	}

	static void extraLongFactorials() {

		int n = 25;

		BigInteger f = new BigInteger("1");

		while (n > 1) {
			f = f.multiply(new BigInteger(String.valueOf(n)));
			n--;
		}
		System.out.println(f);

	}

	static void encryption() {

		String s = "feedthedog";
		s = "chillout";

		String sTrim = s.replaceAll("", "");

		int rowCount = (int) Math.floor(Math.sqrt(sTrim.length()));
		int colCount = (int) Math.ceil(Math.sqrt(sTrim.length()));

		if (rowCount * colCount < sTrim.length()) {
			rowCount = colCount;
		}

		String[] row = new String[rowCount];
		int i = 0, x = 0, y = 0;

		// get the row array from input String -- feed thed og
		while (sTrim.length() > 0) {

			row[i] = sTrim.substring(0, colCount > sTrim.length() ? sTrim.length() : colCount);

			if (colCount > sTrim.length()) {
				break;
			}
			sTrim = sTrim.substring(y + colCount, sTrim.length());

			i++;
		}

		// get the encrypted words from row array
		String encryptedWord = "";

		for (int eachCharCount = 0; eachCharCount < colCount; eachCharCount++) {

			for (String rowString : row) {

				if (eachCharCount >= rowString.length()) {
					break;
				}
				encryptedWord = encryptedWord + rowString.charAt(eachCharCount);

			}
			encryptedWord = encryptedWord + " ";
		}

		System.out.println(encryptedWord);

	}

}
