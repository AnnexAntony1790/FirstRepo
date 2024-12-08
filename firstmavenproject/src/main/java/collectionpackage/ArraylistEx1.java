package collectionpackage;

import java.util.ArrayList;

public class ArraylistEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj=new ArrayList();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Papaya");
		obj.add("Pineapple");
		
		ArrayList<String> obj1=new ArrayList();
		obj1.add("red");
		obj1.add("yellow");
		
		System.out.println(obj.addAll(obj1));
		System.out.println(obj);
		
		System.out.println(obj.contains("red"));
		System.out.println(obj.get(1));
		
		System.out.println(obj.isEmpty());
		
		obj.remove("Apple");
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		
		
		
	}

}
