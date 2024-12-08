package polymorphism;

public class ChildClass extends ParentClass{
	public void add(int a,int b)
	{
		super.add(30,40);
		int c=a-b;
		System.out.println("Subtraction:"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.add(10, 20);
	}

}
