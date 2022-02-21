package chainingHashtable;

public class ChainingHashtableMain {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 1267);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		ChainingHashtable ht = new ChainingHashtable();

		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Smith", marySmith);
		ht.put("Wilson", mikeWilson);
		ht.put("End", billEnd);

		ht.printHashtable();
		
		System.out.println("Retrieve key Smith : "+ht.get("Smith"));
		
		ht.remove("Doe");
		ht.remove("Jones");
		ht.printHashtable();
		
	}

}
