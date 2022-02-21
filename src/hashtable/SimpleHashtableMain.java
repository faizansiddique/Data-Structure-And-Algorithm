package hashtable;

public class SimpleHashtableMain {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 123);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		SimpleHashtable ht = new SimpleHashtable();
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Smith", marySmith);
		ht.put("Wilson", mikeWilson);
		ht.put("End", billEnd);
		
		ht.printHashtable();
		
		System.out.println("------------------------------------------");
		System.out.println(ht.get("Wilson"));
	}

}
