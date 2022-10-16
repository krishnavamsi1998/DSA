//O(n),O(1)

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 3, 78, 28, 298, 12 };
		int n = arr.length;
		int key = 3;
		boolean flag = false;

		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				flag = true;
				break;
			}

		}

		if (flag)
			System.out.print("Found");
		else
			System.out.print("Not Found");
	}

}
