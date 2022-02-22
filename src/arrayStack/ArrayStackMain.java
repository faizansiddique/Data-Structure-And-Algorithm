package arrayStack;

public class ArrayStackMain {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(10);

		stack.push(new Employee("Jane", "Jones", 123));
		stack.push(new Employee("John", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 890));
		stack.push(new Employee("Mike", "Wilson", 6543));
		stack.push(new Employee("Bill", "End", 12556));

		// stack.printstack();

		System.out.println(stack.peek());

		System.out.println("Pooped: " + stack.pop());

		System.out.println(stack.peek());

	}

}
