package linkedStack;

public class LinkedStackMain {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		LinkedStack stack = new LinkedStack();
		stack.push(janeJones);
		stack.push(jhonDoe);
		stack.push(marySmith);
		stack.push(mikeWilson);
		stack.push(billEnd);

		stack.printStack();

		System.out.println(stack.peek());

		System.out.println("Pooped: " + stack.pop());
		System.out.println(stack.peek());

	}

}
