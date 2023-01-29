package Arrays;

public class Sorting {

	public static void main(String[] args) {

		int[] ar = { 2, 4, 3, 1, 5, 7, 8, 6, 9 };

		for (int i = 0; i < ar.length; i++) {

			for (int j = 1; j < ar.length - 1; j++) {

				if (ar[j] < ar[j - 1]) {

					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;

				}
			}
		}

		for (int obj : ar) {
			System.out.println(obj);
		}

	}
}
