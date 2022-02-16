package updatedArrayQueue;

public class ArrayQueueMain {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		ArrayQueue queue = new ArrayQueue(10);
		queue.add(janeJones);
		queue.add(jhonDoe);
		queue.remove();
		queue.add(marySmith);
		queue.remove();
		queue.add(mikeWilson);
		queue.remove();
		queue.add(billEnd);
		queue.remove();
		queue.add(janeJones);

		queue.printQueue();
		System.out.println("------------------------------------");

		queue.add(janeJones);
		queue.add(jhonDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);
		queue.add(billEnd);
		queue.remove();
		queue.remove();
		queue.printQueue();
		System.out.println("------------------------------------");

		queue.add(mikeWilson);
		queue.printQueue();
		System.out.println("------------------------------------");

	}

}
