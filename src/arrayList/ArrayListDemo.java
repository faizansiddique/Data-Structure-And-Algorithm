package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 4567));
		employeeList.add(new Employee("Mary", "Smith", 22));
		employeeList.add(new Employee("Mike", "Wilson", 3245));
		
		employeeList.forEach(employee -> System.out.println(employee));
		
		//to get second employee from the list
		System.out.println("---To get second employee from the list---");
		System.out.println(employeeList.get(1));
		
		System.out.println("---To check whether the list is empty---");
		System.out.println(employeeList.isEmpty());
		
		System.out.println("---To set new employee in the list---");
		System.out.println(employeeList.set(1, new Employee("John", "Adams", 1111)));
		
		System.out.println("---Print all employee name present inside list");
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println("---To get the size---");
		System.out.println(employeeList.size());
		
		System.out.println("---To add new employee in the list---");
		employeeList.add(3, new Employee("Sam", "Anderson", 9989));
		
		System.out.println("----------------------------------------------");
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println("----------------------------------------------");
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for(Employee employee: employeeArray) {
			System.out.println(employee);
		}
		
		System.out.println("---To check whether the list contains an employee---");
		System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
		
		System.out.println("---To get employee using IndexOf---");
		System.out.println(employeeList.indexOf(new Employee("Sam", "Anderson", 9989)));
		
		System.out.println("---To remove item from the list---");
		employeeList.remove(3);
		employeeList.forEach(employee -> System.out.println(employee));
		
		
	}

}
