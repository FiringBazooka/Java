import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
 * 
 * medium - 30 
 */
public class ATaleOfTwoStacks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int queryCount = sc.nextInt();
		sc.nextLine();

		Queue q = new LinkedList();

		for (int i = 1; i <= queryCount; i++) {
			String query = sc.nextLine();

			if (query.startsWith("1")) {
				String[] enqArr = query.split(" ");
				q.add(enqArr[1]);
			} else {
				switch (query) {
				case "2":
					q.poll();
					break;
				case "3":
					System.out.println(q.peek());
				}
			}
		}
		sc.close();

	}

}
