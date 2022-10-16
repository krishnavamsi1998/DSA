//O(n),O(n)

public class LinearSearchUsingRecursion {

	public static void main(String[] args) {
		int[] arr = { 3, 78, 28, 298, 12 };

		int key = 31;

		System.out.println(search(arr, 0, key));

	}

	private static boolean search(int[] arr, int i, int key) {

		// base
		if (i == arr.length)
			return false;

		return arr[i] == key || search(arr, i + 1, key);
	}
}
