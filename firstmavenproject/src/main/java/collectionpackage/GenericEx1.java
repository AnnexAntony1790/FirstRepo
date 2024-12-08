package collectionpackage;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> obj=new ArrayList<String>();
		obj.add("Annex");
		obj.add("Harsha");
		obj.add("Tintu");
		obj.add("Dani");
		obj.add("Lakshmi");
		obj.add("Aiswarya");
		obj.add("Tintu");
		obj.set(2, "T");
		
		System.out.println(obj);
		System.out.println(obj.indexOf("Tintu"));
		System.out.println(obj.lastIndexOf("Tintu"));		
		obj.remove(0);
		System.out.println(obj);
		obj.remove("Dani");
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.contains("Dani"));
		
		
				
	}

}
