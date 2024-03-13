package two_pointers;

public class SortedArraySquares {

	public static void main(String[] args) {

		int[] result = SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 });
		for (int num : result)
			System.out.print(num + " ");
		System.out.println();

		result = SortedArraySquares.makeSquares(new int[] { -3, -1, 0, 1, 2 });
		for (int num : result)
			System.out.print(num + " ");
		System.out.println();
	}

	public static int[] makeSquares(int[] arr) {
		int[] squares = new int[arr.length];
		int left = 0;
		int right = arr.length - 1;
		int highestIndex = arr.length - 1;

		while (left <= right) {
			int leftValue = arr[left] * arr[left];
			int rightValue = arr[right] * arr[right];

			if (leftValue > rightValue) {

				squares[highestIndex--] = leftValue;
				left++;
			} else {
				squares[highestIndex--] = rightValue;
				right--;
			}
		}

		return squares;
	}
}
