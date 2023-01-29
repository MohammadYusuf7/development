package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80,90,100 };

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the key");

		int key = scan.nextInt();
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == a[mid]) {
				System.out.println(" the key is : " + key + " " + "The index Bound is : " + mid);
				break;
			} else if (key < a[mid]) {

				high = mid - 1;

			} else if (key > a[mid]) {
				low = mid + 1;
			}
		}
		if (low > high) {
			System.out.println("key Not found");
		}

	}

}
