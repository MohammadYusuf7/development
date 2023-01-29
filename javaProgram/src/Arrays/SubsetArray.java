package Arrays;

public class SubsetArray {
	
	public static boolean checkIfSubset(int[] firstArray, int[] secondArray) {
		
		int firstArrayLength = firstArray.length;
		int secondArrayLength = secondArray.length;
		int i = 0, j = 0;
		for (i = 0; i < firstArrayLength; i++) {
			for (j = 0; j < secondArrayLength; j++) {
				if (firstArray[i] == secondArray[j]) {
					break;
				}
			}
			if (j == secondArrayLength) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3, 4, 5 };
		int[] secondArray = { 8, 9, 7 };

		boolean isSubset = checkIfSubset(firstArray, secondArray);
		
		if (isSubset) {
			System.out.println("The second array is a subset of the first array.");
		} else {
			System.out.println("The second array is not a subset of the first array.");
		}
		
	}

	
}
