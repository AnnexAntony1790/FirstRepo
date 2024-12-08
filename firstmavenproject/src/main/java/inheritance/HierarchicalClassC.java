package inheritance;

public class HierarchicalClassC extends HierarchialClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalClassC obj=new HierarchicalClassC();
		obj.display();
		obj.difference();

	}
	public void difference()
	{
		int a=10;int b=20;
		int c=b-a;
		System.out.println("Difference:"+c);
	}

}
