import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Practice - Interview Preparation Kit -- Dictionaries and Hashmaps --
 * Frequency Queries
 * 
 * Medium 40
 * 
 * 16.5 points
 * 
 * Needs to be optimized
 *
 */
public class FrequencyQueries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int queryCount = sc.nextInt();
		sc.nextLine();

		List<List<Integer>> list2 = new ArrayList();

		List<Integer> queryList = new ArrayList();
		for (int i = 1; i <= queryCount; i++) {

			String[] queryArray = null;
			queryArray = sc.nextLine().split(" ");

			int key = Integer.parseInt(queryArray[0]);
			int value = Integer.parseInt(queryArray[1]);

			List<Integer> list1 = new ArrayList();
			list1.add(key);
			list1.add(value);
			list2.add(list1);

		}

		freqQuery(list2);

	}

	// Complete the freqQuery function below.
	static List<Integer> freqQuery(List<List<Integer>> queries) {

		List<Integer> resultList = new ArrayList();

		List<Integer> queryList = new ArrayList();

		for (List<Integer> l2 : queries) {

			int key = l2.get(0);
			int value = l2.get(1);

			switch (key) {
			case 1:
				queryList.add(value);
				break;
			case 3:
				List<Integer> temp = new ArrayList();
				int t = 0;
				for (int q : queryList) {
					if (!temp.contains(q)) {
						int count = Collections.frequency(queryList, q);
						if (count == value) {
							resultList.add(1);
							t = 1;
							break;
						}
						temp.add(q);
					}
				}
				if (t == 0)
					resultList.add(0);
				break;
			case 2:
				// queryList.removeIf(query -> query.i==value);
				if (queryList.contains(value))
					queryList.remove(new Integer(value));
				break;
			}
		}

		return resultList;
	}

}
