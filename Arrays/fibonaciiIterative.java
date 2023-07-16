import java.util.ArrayList;
import java.util.List;
//O(n),O(n)

public class fibonaciiIterative {

	public static void main(String[] args) {

		// no of fibonacii numbers i want to generate
		int n = 10;

		int first = 0;
		int second = 1;
		int sum = 0;
		List<Integer> res = new ArrayList<>();

		res.add(first);
		res.add(second);

		for (int i = 0; i < n-2; i++) {
			sum = first + second;
			first = second;
			second = sum;
			res.add(second);
		}

		System.out.println(res);

	}

}
