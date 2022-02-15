package jdkLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class JDKLinkedList {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		LinkedList<Employee> list = new LinkedList<>();
		list.addFirst(janeJones);
		list.addFirst(jhonDoe);
		list.addFirst(marySmith);
		list.addFirst(mikeWilson);

		Iterator itr = list.iterator();
		System.out.print("HEAD -> ");
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("<-->");
		}
		System.out.println("null");

		list.addLast(billEnd);
		itr = list.iterator();
		System.out.print("HEAD -> ");
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("<-->");
		}
		System.out.println("null");

		list.removeFirst();
		itr = list.iterator();
		System.out.print("HEAD -> ");
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("<-->");
		}
		System.out.println("null");

		list.removeLast();
		itr = list.iterator();
		System.out.print("HEAD -> ");
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("<-->");
		}
		System.out.println("null");

	}

}
