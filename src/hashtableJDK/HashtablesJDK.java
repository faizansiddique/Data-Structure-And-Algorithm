package hashtableJDK;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashtablesJDK {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		Map<String, Employee> hashMap = new HashMap<String,Employee>();
		hashMap.put("Jones", janeJones);
		hashMap.put("Doe", johnDoe);
		hashMap.put("Smith", marySmith);
		hashMap.put("Wilson", mikeWilson);
		hashMap.put("End", billEnd);
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.containsKey("Doe"));
		System.out.println(hashMap.containsValue(janeJones));
		
		Iterator<Employee> itr = hashMap.values().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		hashMap.forEach((k,v) -> System.out.println("Key = "+k +", Employee = "+ v));

	}

}
