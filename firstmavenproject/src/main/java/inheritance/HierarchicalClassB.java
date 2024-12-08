package inheritance;

public class HierarchicalClassB extends HierarchialClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalClassB obj=new HierarchicalClassB();
		obj.display();
		obj.add();

	}
	public void add()
	{
		int a=10;int b=20;
		int c=a+b;
		System.out.println("sum:"+c);
	}

}
