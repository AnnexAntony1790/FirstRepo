package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj=new ArrayList<String>();
		obj.add("BMW");
		obj.add("Benz");
		obj.add("Ferrari");
		obj.add("Audi");
		obj.add("LandRover");
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		it.remove();
		System.out.println(obj);
		
		
	}

}
