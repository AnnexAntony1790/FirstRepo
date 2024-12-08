package collectionpackage;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj=new LinkedList();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Papaya");
		obj.add("Pineapple");
		
		LinkedList<String> obj1=new LinkedList();
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
