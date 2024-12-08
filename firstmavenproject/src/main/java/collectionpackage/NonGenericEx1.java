package collectionpackage;

import java.util.ArrayList;
import java.util.List;

public class NonGenericEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List obj=new ArrayList();
		obj.add(1);
		obj.add(2.1f);
		obj.add("Annex");
		obj.add('c');
		System.out.println(obj);
	}

}
