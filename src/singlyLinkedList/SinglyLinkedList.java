package singlyLinkedList;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		
		System.out.println(list.isEmpty());
		
		list.addToFront(janeJones);
		list.addToFront(jhonDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		System.out.println(list.getSize() );
		
		list.printList();
		
		list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();
		
	}

}
