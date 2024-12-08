package collectionpackage;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set obj = new HashSet();
		obj.add("Annex");
		obj.add("Lakshmi");
		obj.add("Dani");
		obj.add("Aiswarya");
		obj.add("Harsha");
		obj.add("Tintu");
		obj.add("Anu");
		System.out.println("Total names added:" + obj);

		// Check if a name exists
		if (obj.contains("Anu")) {
			System.out.println("Anu is in the set.");
		}

		Set obj1 = new HashSet();

		System.out.println("Inserted all in obj1:" + obj1);

		obj1.clear();
		System.out.println("Obj1 cleared:" + obj1);

		System.out.println(obj.contains("Harsha"));

		obj.remove("Anu");
		System.out.println("After removing Anu:" + obj);

		System.out.print("Size of array:");
		System.out.println(obj.size());

	}

}
