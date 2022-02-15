package doublyLinkedList;


public class DoublyLinkedList {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		System.out.println(list.getSize());
		
		Employee billend = new Employee("Bill", "End", 78);
		list.addToEnd(billend);
		list.printList();
		System.out.println(list.getSize());
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
		list.removeFromEnd();
		list.printList();
		System.out.println(list.getSize());
	}

}
