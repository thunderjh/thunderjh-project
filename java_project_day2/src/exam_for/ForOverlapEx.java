package exam_for;

public class ForOverlapEx {
	// 1 2 3 4 5
	// 1 2 3 4 5
	// 1 2 3 4 5
	// 1 2 3 4 5
	// 1 2 3 4 5

	public static void main(String[] args) {
		for (int y = 1; y <= 5; y++) {
			for (int x = 1; x <= 5; x++) {
				System.out.print(x + " ");

			}
			System.out.println();
		}

		System.out.println();
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println("");

		}
		System.out.println();

		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		for (int k = 1; k <= 5; k++) {
			for (int t = 1; t <= k; t++) {
				System.out.print(t + " ");
			}
			System.out.println();
		}

	}
}
