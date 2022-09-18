package stackImpl;

class Stack {

	int[] arr;
	int size;
	int top;

	Stack(int size) {
		arr = new int[size];
		this.size = size;
		top = -1;

	}
	//O(1)
	public void push(int ele) {
		if (!isFull())
			arr[++top] = ele;
		else
			System.out.println("stack over flow !!");

	}
	//O(1)
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("stack under flow !!");
			System.exit(-1);
		}

		return arr[top--];

	}

	public boolean isEmpty() {

		return top == -1;
	}

	public boolean isFull() {

		return top == size - 1;
	}
	
	//O(n)
	public void printStack() {
		if (isEmpty())
			System.out.println("stack is empty !!");

		else {
			System.out.println("printing stack..");
			for (int i = top; i >= 0; i--)
				System.out.println(arr[i]);
		}
	}

}

class StackMain {

	public static void main(String[] args) {

		Stack stack = new Stack(3);
		stack.push(2);
		stack.push(7);
		stack.push(-87);

		stack.printStack();

		/*
		 * System.out.println("Element deleted "+stack.pop());
		 * 
		 * stack.printStack(); System.out.println("Element deleted "+stack.pop());
		 * 
		 * stack.printStack(); System.out.println("Element deleted "+stack.pop());
		 * stack.printStack(); System.out.println("Element deleted "+stack.pop());
		 */

		stack.push(9);

	}

}
